package com.example.CRUDoperations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class CruDoperationsApplication {

	public static void main(String[] args) {
		Dotenv.load();
		SpringApplication.run(CruDoperationsApplication.class, args);
	}

}
