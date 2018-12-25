package com.andrewpeth.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.andrewpeth")
public class Steeltoe {
	public static void main(String[] args) {
		SpringApplication.run(Steeltoe.class, args);
	}
}

