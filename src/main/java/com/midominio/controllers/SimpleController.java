package com.midominio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    @GetMapping("/")
    public String f1() {
        return "f1";
    }

    @GetMapping("/hello")
    public String homePage() {
        return "home";
    }
}