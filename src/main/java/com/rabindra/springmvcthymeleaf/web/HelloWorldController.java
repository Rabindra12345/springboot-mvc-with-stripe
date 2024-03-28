package com.rabindra.springmvcthymeleaf.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HelloWorldController {
    
    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("/")
    public String getHomePage() {
        LOG.info("Returning CONTROLLER CODE AT TIME  {}",new Date());
        return "index";
    }
}
