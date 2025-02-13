package com.calculatorapp.service;

import org.springframework.stereotype.Service;

@Service
public class SubtractionService {
    public double subtract(double a, double b) {
    	System.out.println("the sub of values is :"+(a-b));
        return a - b;
    }
}
