package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//둘 중 하나만 해도 작동되는 것 확인.
@SpringBootApplication(scanBasePackages = {"com.example.demo", 
                                 "main.controller", 
                                 "user.*"})
//@ComponentScan(basePackages = {"com.example.demo", "main.controller", "user.*"})
public class Chapter02MySqlApplication {

   public static void main(String[] args) {
      SpringApplication.run(Chapter02MySqlApplication.class, args);
   }

}