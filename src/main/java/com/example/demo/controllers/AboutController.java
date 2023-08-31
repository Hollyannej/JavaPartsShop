package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/aboutpage")
    public String aboutPage() {
        return "aboutpage"; // This assumes you have a template named "about.html" in your templates directory
    }
}

