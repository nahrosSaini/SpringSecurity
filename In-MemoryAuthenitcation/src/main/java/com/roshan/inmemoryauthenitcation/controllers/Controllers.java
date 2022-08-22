package com.roshan.inmemoryauthenitcation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

    @GetMapping(value = "/")
    public String getDefault(){
        return "dashboard";
    }
}
