package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.ContactPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

public abstract class AbstractEmailService implements EmailService{

    @Value("${default.to.address}")
    private String defaultToAddress;

    protected SimpleMailMessage prepareSimpleMailMessageFromContactPojo(ContactPojo contact) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(defaultToAddress);
        message.setFrom(contact.getEmail());
        message.setSubject("[DevOps Buddy]: Contact info received from: " + contact.getName() + "!");
        message.setText(contact.getMessage());

        return message;
    }


    @Override
    public void sendContactEmail(ContactPojo contactPojo) {
        sendGenericEmailMessage(prepareSimpleMailMessageFromContactPojo(contactPojo));
    }


}
