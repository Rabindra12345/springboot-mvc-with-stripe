package com.rabindra.springmvcthymeleaf.config;

import com.rabindra.springmvcthymeleaf.backend.service.EmailService;
import com.rabindra.springmvcthymeleaf.backend.service.SmtpMailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

//@Configuration
//@Profile("prod")
//@PropertySource("file:///home/rabindra-jar/springboot/stripeconfigdirec/application-prod.properties")
//public class ProductionConfig {
//
//    @Bean
//    public EmailService emailService() {
//        return new SmtpMailService();
//    }
//}

@Configuration
@Profile("prod")
@PropertySource("file:///home/rabindra-jar/springboot/stripeconfigdirec/application-prod.properties")
public class ProductionConfig {

    @Bean
    public EmailService emailService() {
        return new SmtpMailService();
    }
}
