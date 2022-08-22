package com.roshan.database_authentication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLoginPage(){
        return "loginPage";
    }

    @GetMapping("/dashboard")
    public String getDashboard(){
        return "dashboard";
    }
}
