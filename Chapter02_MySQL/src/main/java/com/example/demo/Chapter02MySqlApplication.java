package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"main.controller","user.service", "user.controller", "user.dao", "user.bean"})
public class Chapter02MySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chapter02MySqlApplication.class, args);
	}

}
