package com.calculatorapp.model;

public class CalculationResponse {

    private double result;
    private String operation;

    // Constructor
    public CalculationResponse(double result, String operation) {
        this.result = result;
        this.operation = operation;
    }

    // Getters
    public double getResult() {
        return result;
    }

    public String getOperation() {
        return operation;
    }
}
