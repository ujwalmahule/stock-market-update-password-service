package com.ujwal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class UpdatePasswordServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdatePasswordServiceApplication.class, args);
	}
	
	@RequestMapping(value = "/")
	public String home() {
		return "Eureka Client application";
	}
}
	