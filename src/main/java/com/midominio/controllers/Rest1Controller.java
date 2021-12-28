package com.midominio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest1Controller {
    
    @GetMapping("/hello2")
    public String f1() {
        return "f1";
    }

    @GetMapping("/hello3")
    public String homePage() {
        return "home";
    }
}