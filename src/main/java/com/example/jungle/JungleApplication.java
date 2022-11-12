package com.example.jungle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class JungleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JungleApplication.class, args);
	}

}
