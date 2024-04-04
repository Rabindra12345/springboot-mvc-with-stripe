package com.rabindra.springmvcthymeleaf.backend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockMailService extends EmailServiceAbs{

    private static final Logger LOG = LoggerFactory.getLogger(MockMailService.class);

    @Override
    public void sendGenericEmailMessage(SimpleMailMessage message) {
        LOG.debug("Simulating an email serice...");
        LOG.info(message.toString());
        LOG.debug("Email sent.");
    }
}
