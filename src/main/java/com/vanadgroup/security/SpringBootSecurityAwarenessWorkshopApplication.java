package com.vanadgroup.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootSecurityAwarenessWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityAwarenessWorkshopApplication.class, args);
	}
}
