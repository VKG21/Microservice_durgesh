package com.user.service.UserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceIsHereApplication {

	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
		
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(UserServiceIsHereApplication.class, args);
	}

}