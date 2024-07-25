package com.josh.assignment6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class Assignment6Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment6Application.class, args);
	}

}
