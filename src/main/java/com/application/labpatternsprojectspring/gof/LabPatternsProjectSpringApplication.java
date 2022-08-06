package com.application.labpatternsprojectspring.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Project generated via SpringInitializr.
 * The modules below has been added:
 * - Spring Data JPA.
 * - Spring WEB.
 * - H2 Database.
 * - OpenFeign.
 *
 * @author Gabriel
 */

@EnableFeignClients
@SpringBootApplication
public class LabPatternsProjectSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPatternsProjectSpringApplication.class, args);
	}

}
