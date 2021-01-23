package com.exercise.vaccnow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class VaccnowApplication {

    public static void main(String[] args) {
//        System.out.println(LocalDateTime.parse("2020-01-23T18:25").getDayOfMonth());
        SpringApplication.run(VaccnowApplication.class, args);
    }

}
