package com.example.eurakaprovider2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEurakaController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("index")
    public String index() {
        return "Hello World!端口："+port;
    }
}
