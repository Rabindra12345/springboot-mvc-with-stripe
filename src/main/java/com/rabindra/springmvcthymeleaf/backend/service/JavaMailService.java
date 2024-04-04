//package com.rabindra.springmvcthymeleaf.backend.service;
//
//import java.util.Properties;
//
//import jakarta.mail.Authenticator;
//import jakarta.mail.Message;
//import jakarta.mail.PasswordAuthentication;
//import jakarta.mail.Session;
//import jakarta.mail.Transport;
//import jakarta.mail.internet.InternetAddress;
//import jakarta.mail.internet.MimeMessage;
//
////import javax.mail.Message;
////import javax.mail.PasswordAuthentication;
////import javax.mail.Session;
////import javax.mail.Transport;
////import javax.mail.internet.InternetAddress;
////import javax.mail.internet.MimeMessage;
//public class JavaMailService {
//    public static void main(String [] args) {
//        sendEmail();
//    }
//
//    private static void sendEmail() {
//
//        // Create all the needed properties
//        Properties connectionProperties = new Properties();
//        // SMTP host
//        connectionProperties.put("mail.smtp.host", "smtp.gmail.com");
//        // Is authentication enabled
//        connectionProperties.put("mail.smtp.auth", "true");
//        // Is TLS enabled
//        connectionProperties.put("mail.smtp.starttls.enable", "true");
//        // SSL Port
//        connectionProperties.put("mail.smtp.socketFactory.port", "587");
//        // SSL Socket Factory class
//        connectionProperties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        // SMTP port, the same as SSL port :)
//        connectionProperties.put("mail.smtp.port", "587");
//
//        System.out.print("Creating the session...");
//
//        // Create the session
//        Session session = Session.getDefaultInstance(connectionProperties,
//                new Authenticator() {	// Define the authenticator
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication("rabindradahal2015@gmail.com","waof uztc nzic urff");
//                    }
//                });
//
//        System.out.println("done!");
//
//        // Create and send the message
//        try {
//            // Create the message
//            Message message = new MimeMessage(session);
//            // Set sender
//            message.setFrom(new InternetAddress("rabindradahal2015@gmail.com"));
//            // Set the recipients
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("oakerooaker@gmail.com"));
//            // Set message subject
//            message.setSubject("Hello from Team gmail");
//            // Set message text
//            message.setText("Let's go rabindra, you can do it . FUCK YEAH .");
//
//            System.out.print("Sending message...");
//            // Send the message
//            Transport.send(message);
//
//            System.out.println("done!");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}