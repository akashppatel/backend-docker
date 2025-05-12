package com.sb.backend;

import com.sb.backend.controller.GroceryController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	static Logger logger = LoggerFactory.getLogger(BackendApplication.class);

	public static void main(String[] args) {
		logger.info("Application started");
		SpringApplication.run(BackendApplication.class, args);
	}



}
