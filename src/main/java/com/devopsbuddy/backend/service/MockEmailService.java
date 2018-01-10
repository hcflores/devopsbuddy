package com.devopsbuddy.backend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailService {

    /** the application logger **/
    private static final Logger logger = LoggerFactory.getLogger(MockEmailService.class);

    @Override
    public void sendGenericEmailMessage(SimpleMailMessage message) {
        logger.debug("Simulating an email service...");
        logger.debug(message.toString());
        logger.debug("email sent");
    }
}
