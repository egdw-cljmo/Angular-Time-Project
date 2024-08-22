package com.example.Timeappback;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TimeappbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeappbackApplication.class, args);
	}

}
