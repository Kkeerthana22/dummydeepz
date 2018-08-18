package com.capg.capstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.capg.capstore")
public class WishlistbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WishlistbackendApplication.class, args);
	}
	
}
