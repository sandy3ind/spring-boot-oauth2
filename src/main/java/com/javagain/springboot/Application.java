package com.javagain.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Application class should be at root folder in order to be able to scan beans
 * 
 * @author Sandeep.Sharma
 *
 */
@SpringBootApplication
@ComponentScan({ "com.javagain.security*" })
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
	
}
