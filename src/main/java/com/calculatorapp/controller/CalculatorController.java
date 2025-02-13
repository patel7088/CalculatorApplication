package com.calculatorapp.controller;

import com.calculatorapp.model.CalculationRequest;
import com.calculatorapp.model.CalculationResponse;
import com.calculatorapp.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    // Constructor for Dependency Injection of CalculatorService
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    // GET method for addition
    @GetMapping("/add")
    public CalculationResponse add(@RequestParam(required = false) Double a, @RequestParam(required = false) Double b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Both numbers must be provided");
        }
        double result = a + b;
        return new CalculationResponse(result, "addition");
    }

    // GET method for subtraction
    @GetMapping("/subtract")
    public CalculationResponse subtract(@RequestParam(required = false) Double a, @RequestParam(required = false) Double b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Both numbers must be provided");
        }
        double result = calculatorService.subtract(a, b);
        return new CalculationResponse(result, "subtraction");
    }

    // GET method for multiplication
    @GetMapping("/multiply")
    public CalculationResponse multiply(@RequestParam(required = false) Double a, @RequestParam(required = false) Double b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Both numbers must be provided");
        }
        double result = calculatorService.multiply(a, b);
        return new CalculationResponse(result, "multiplication");
    }

    // GET method for division
    @GetMapping("/divide")
    public CalculationResponse divide(@RequestParam(required = false) Double a, @RequestParam(required = false) Double b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Both numbers must be provided");
        }
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        double result = calculatorService.divide(a, b);
        return new CalculationResponse(result, "division");
    }

    // POST method for addition
    @PostMapping("/add")
    public CalculationResponse add(@RequestBody CalculationRequest request) {
        if (request.getNum1() == null || request.getNum2() == null) {
            throw new IllegalArgumentException("Both numbers must be provided");
        }
        double result = calculatorService.add(request.getNum1(), request.getNum2());
        return new CalculationResponse(result, "addition");
    }

    // POST method for subtraction
    @PostMapping("/subtract")
    public CalculationResponse subtract(@RequestBody CalculationRequest request) {
        if (request.getNum1() == null || request.getNum2() == null) {
            throw new IllegalArgumentException("Both numbers must be provided");
        }
        double result = calculatorService.subtract(request.getNum1(), request.getNum2());
        return new CalculationResponse(result, "subtraction");
    }

    // POST method for multiplication
    @PostMapping("/multiply")
    public CalculationResponse multiply(@RequestBody CalculationRequest request) {
        if (request.getNum1() == null || request.getNum2() == null) {
            throw new IllegalArgumentException("Both numbers must be provided");
        }
        double result = calculatorService.multiply(request.getNum1(), request.getNum2());
        return new CalculationResponse(result, "multiplication");
    }

    // POST method for division
    @PostMapping("/divide")
    public CalculationResponse divide(@RequestBody CalculationRequest request) {
        if (request.getNum1() == null || request.getNum2() == null) {
            throw new IllegalArgumentException("Both numbers must be provided");
        }
        if (request.getNum2() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        double result = calculatorService.divide(request.getNum1(), request.getNum2());
        return new CalculationResponse(result, "division");
    }
}
