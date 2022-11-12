package com.example.jungle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot! ok ok ok ok ok";
    }

    @GetMapping("/customers")
    public String customers() {
        return "Customers from Spring Boot! ok ok ok ok ok";
    }

}
