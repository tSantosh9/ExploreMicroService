package com.explore.userdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.explore.userdetails.service.UserService;

@SpringBootApplication
public class UserDetailsApplication {

	@Bean
	public UserService getUserService() {
		return new UserService();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(UserDetailsApplication.class, args);
	}

}
