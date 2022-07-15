package com.javatestwork.JavaTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(JavaTestApplication.class, args);
    }

}

