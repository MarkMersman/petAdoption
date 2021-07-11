package com.revature.project2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.revature")
@EnableJpaRepositories("com.revature.repos")
@EntityScan("com.revature.beans")
public class PetAdoptionAgencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetAdoptionAgencyApplication.class, args);
	}

}