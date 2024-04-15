package com.rabindra.springmvcthymeleaf.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PayloadController {

    private static final String PAYLOAD_URL = "payload/payload";

    @RequestMapping("/payload")
    public String getPayloadUrl(){
        return PAYLOAD_URL;
    }
}
