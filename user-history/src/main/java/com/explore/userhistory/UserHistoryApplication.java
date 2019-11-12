package com.explore.userhistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.explore.userhistory.service.HistoryService;

@SpringBootApplication
public class UserHistoryApplication {
	
	@Bean
	public HistoryService getHistoryService() {
		return new HistoryService();
	}

	public static void main(String[] args) {
		SpringApplication.run(UserHistoryApplication.class, args);
	}

}
