package com.calculatorapp;

import org.springframework.stereotype.Service;

@Service
public class DivisionService {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        System.out.println("the div of values is :"+(a/b));
        return a / b;
    }
}
