package com.example.eurakaprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurakaprovider2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurakaprovider2Application.class, args);
    }

}
