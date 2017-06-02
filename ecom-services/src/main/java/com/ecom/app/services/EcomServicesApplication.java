package com.ecom.app.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class EcomServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomServicesApplication.class, args);
	}
}
