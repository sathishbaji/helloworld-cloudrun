package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloworldController {

    @Value("${NAME:World}")
    String name;

    @GetMapping("/")
    String hello() {
        return "Hello " + name + "!";
    }
}