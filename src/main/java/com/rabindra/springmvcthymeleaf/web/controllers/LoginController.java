package com.rabindra.springmvcthymeleaf.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


    private final String LOGIN_VIEW_PAGE = "user/login";

    @RequestMapping("/login")
    public String login(){
        return LOGIN_VIEW_PAGE;
    }
}
