package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RedhatHackathonApplication {
	
	@GetMapping("/")
	public String getMessage() {
		return "Hi, Im Alive";
	}

	public static void main(String[] args) {
		SpringApplication.run(RedhatHackathonApplication.class, args);
	}

}
