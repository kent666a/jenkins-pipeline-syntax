package com.kent.jenkins.testspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestspringApplication.class, args);
	}

	@Bean
	public String test() {
		System.out.println("Hello world");
		return "Hello";
	}
}
