package com.skillsoft.springinitalizer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "We 've successfully loaded Spring Initializer!";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
}
