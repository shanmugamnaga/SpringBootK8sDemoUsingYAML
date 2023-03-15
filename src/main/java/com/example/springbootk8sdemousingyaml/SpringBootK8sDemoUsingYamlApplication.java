package com.example.springbootk8sdemousingyaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootK8sDemoUsingYamlApplication {

	@GetMapping("/hello")

	public String helloAll() {

		return "Welcome to EnggAdda";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootK8sDemoUsingYamlApplication.class, args);
	}

}
