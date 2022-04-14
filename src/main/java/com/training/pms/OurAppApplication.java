package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class OurAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OurAppApplication.class, args);
		System.out.println("Hello programmer");
	}
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello and welcome";
	}

}
