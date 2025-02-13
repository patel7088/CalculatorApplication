package com.calculatorapp.service;

import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {
    public double multiply(double a, double b) {
    	System.out.println("the mul of values is :"+(a*b));
        return a * b;
    }
}
