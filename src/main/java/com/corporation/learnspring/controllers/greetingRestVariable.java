package com.corporation.learnspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingRestVariable {
    @GetMapping("/saludo/{name}")
    public String greeting(@PathVariable String name) {
        return "Hello " + name;
    }

}
