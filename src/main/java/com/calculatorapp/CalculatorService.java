package com.calculatorapp;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private final AdditionService additionService;
    private final SubtractionService subtractionService;
    private final MultiplicationService multiplicationService;
    private final DivisionService divisionService;

    public CalculatorService(AdditionService additionService, 
                             SubtractionService subtractionService, 
                             MultiplicationService multiplicationService, 
                             DivisionService divisionService) {
        this.additionService = additionService;
        this.subtractionService = subtractionService;
        this.multiplicationService = multiplicationService;
        this.divisionService = divisionService;
    }

    public double add(double a, double b) {
        return additionService.add(a, b);
    }

    public double subtract(double a, double b) {
        return subtractionService.subtract(a, b);
    }

    public double multiply(double a, double b) {
        return multiplicationService.multiply(a, b);
    }

    public double divide(double a, double b) {
        return divisionService.divide(a, b);
    }
}
