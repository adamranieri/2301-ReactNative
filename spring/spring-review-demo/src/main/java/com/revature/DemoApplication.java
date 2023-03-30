package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// indicate the package that we want to scan for components:
@ComponentScan(basePackages = "com.revature")
// explicitly indicating where we want to look for our entities:
@EntityScan(basePackages = "com.revature.entities")
// Tell Spring where to look for our repositories:
@EnableJpaRepositories(basePackages = "com.revature.repositories")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
