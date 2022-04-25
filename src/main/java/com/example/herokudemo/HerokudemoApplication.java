package com.example.herokudemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HerokudemoApplication {
    @GetMapping("/")
    public String hello(){
        return "hello1212 world";
    }
    public static void main(String[] args) {
        SpringApplication.run(HerokudemoApplication.class, args);
    }

}
