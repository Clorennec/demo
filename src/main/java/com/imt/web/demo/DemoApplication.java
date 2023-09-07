package com.imt.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void init() {
		ProcessBuilder processBuilder = new ProcessBuilder();

		try {
			processBuilder.start();
			// Gérer le processus (attendre la fin, récupérer les erreurs, etc.)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
