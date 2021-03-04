package com.xiaoxin.wiki.controller;

import com.xiaoxin.wiki.domain.Test;
import com.xiaoxin.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Value("${test.name:jhang}")
    private String name;

    @Resource
    private TestService testService;

    @GetMapping("/test")
    public String test() {
        return "hello " + name ;
    }

    @GetMapping("/list")
    public List<Test> list() {
        return testService.list();
    }
}
