package com.example.redhathackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class RedhatHackathonApplication {

	@GetMapping("/")
	public String getMessage(){
		return "Spring app";
	}

	@PostMapping("/{input}")
	public String getMessage(@pathVariable String input){
		return "Hi "+ input;
	}

	public static void main(String[] args) {
		SpringApplication.run(RedhatHackathonApplication.class, args);
	}

}
