package com.calculatorapp;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {
    public double add(double a, double b) {
    	System.out.println("the add of values is :"+(a+b));
        return a + b;
    }
}
