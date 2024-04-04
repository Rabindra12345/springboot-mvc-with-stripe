package com.rabindra.springmvcthymeleaf.config;

import com.rabindra.springmvcthymeleaf.backend.service.EmailService;
import com.rabindra.springmvcthymeleaf.backend.service.MockMailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("dev")
@PropertySource("file:///home/rabindra-jar/springboot/stripeconfigdirec/application-dev.properties")
public class DevelopmentConfig {

    @Bean
    public EmailService emailService() {
        return new MockMailService();
    }

}
