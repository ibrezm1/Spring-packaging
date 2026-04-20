package com.example.demo2.controller;

import com.example.demo2.service.Hello2Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {

    private final Hello2Service hello2Service;

    public Hello2Controller(Hello2Service hello2Service) {
        this.hello2Service = hello2Service;
    }

    @GetMapping("/hello2")
    public String hello() {
        return hello2Service.greet();
    }
}