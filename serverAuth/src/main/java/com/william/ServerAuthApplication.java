package com.william;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServerAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerAuthApplication.class, args);
	}
	
	@GetMapping("/user")
	public Principal getUser(Principal user) {
		return user;
	}

}
