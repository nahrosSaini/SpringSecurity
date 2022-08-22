package com.roshan.database_authentication.controllers;

import com.roshan.database_authentication.models.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLoginPage(){
        return "loginPage";
    }

    @GetMapping("/dashboard")
    public String getDashboard(@AuthenticationPrincipal User user, ModelMap modelMap){

        modelMap.put("user",user);
        return "dashboard";
    }
}
