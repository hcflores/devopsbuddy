package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.ContactPojo;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    public void sendContactEmail(ContactPojo contactPojo);

    public void sendGenericEmailMessage(SimpleMailMessage message);

}
