package com.corporation.learnspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldRestController {
    @GetMapping({"/hello", "/hw", "/ricardo" })
    public String sayHello() {
        System.out.println("solicitud ejecutada");
        return "Hello World!";
    }
}
