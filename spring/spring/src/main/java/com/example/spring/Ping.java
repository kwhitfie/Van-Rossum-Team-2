package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ping {

    @GetMapping("/")
    public String homePage() {
        return "Welcome";
    }

    @GetMapping("/ping")
    public String ping(){
        return "Pong";
    }
}

