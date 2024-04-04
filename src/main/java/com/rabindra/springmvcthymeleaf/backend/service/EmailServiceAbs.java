package com.rabindra.springmvcthymeleaf.backend.service;

import com.rabindra.springmvcthymeleaf.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

public abstract class EmailServiceAbs  implements EmailService{

    protected SimpleMailMessage prepareSimpleMailMessageFromFeedbackPojo(FeedbackPojo feedback) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("rabindradahal2015@gmail.com");
        message.setFrom(feedback.getEmail());
        message.setSubject(" Feedback received from " + feedback.getFirstName() + " " + feedback.getLastName() + "!");
        message.setText(feedback.getFeedback());
        return message;
    }

    @Override
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo) {
        sendGenericEmailMessage(prepareSimpleMailMessageFromFeedbackPojo(feedbackPojo));
    }

}
