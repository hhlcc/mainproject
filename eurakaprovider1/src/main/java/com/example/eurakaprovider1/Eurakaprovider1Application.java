package com.example.eurakaprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurakaprovider1Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurakaprovider1Application.class, args);
    }

}
