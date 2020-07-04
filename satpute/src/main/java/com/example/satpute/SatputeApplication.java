package com.example.satpute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SatputeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SatputeApplication.class, args);
	}

	@GetMapping("/ankit")
	public String hello(){
		return "Hello Ankit";
	}
}
