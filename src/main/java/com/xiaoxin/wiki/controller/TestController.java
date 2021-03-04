package com.xiaoxin.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.name:jhang}")
    private String name;

    @GetMapping("/test")
    public String test() {
        return "hello " + name ;
    }
}
