package com.calculatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CalculatorApplication.class, args);
		CalculatorService obj = context.getBean(CalculatorService.class);
		obj.add(2, 3);
		obj.subtract(5, 4);
		obj.multiply(5, 4);
		obj.divide(5,20);
	}

}
