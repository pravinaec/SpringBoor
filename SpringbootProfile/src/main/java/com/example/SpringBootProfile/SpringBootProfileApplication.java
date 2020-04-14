package com.example.SpringBootProfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.oracle.controller", "com.example.SpringBootProfile"})
public class SpringBootProfileApplication {

     public static void main(String[] args) {
          SpringApplication.run(SpringBootProfileApplication.class, args);
     }

}
