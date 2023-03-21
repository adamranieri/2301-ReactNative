package com.revature.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.io.File;

@SpringBootApplication
@PropertySource("classpath:prod.properties")
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		System.out.println(System.getenv("RDS_URL"));
		SpringApplication.run(SpringBootDemoApplication.class, args);

	}

}
