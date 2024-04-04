package com.rabindra.springmvcthymeleaf.web.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class IndexController {
    
    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/")
    public String getHomePage() {
        LOG.info("Returning CONTROLLER CODE AT TIME  {}",new Date());
        return "index";
    }
}
