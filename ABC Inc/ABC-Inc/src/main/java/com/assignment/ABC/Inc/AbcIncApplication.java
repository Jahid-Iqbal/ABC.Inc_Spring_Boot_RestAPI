package com.assignment.ABC.Inc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication(scanBasePackages = {"com.assignment.ABC.Inc.controller","com.assignment.ABC.Inc.controller"})
public class AbcIncApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcIncApplication.class, args);
	}

}
