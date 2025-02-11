package com.calculatorapp;
import org.springframework.web.bind.annotation.*; 
@RestController
@RequestMapping
public class CalculatorController {
public CalculatorService calculatorService;
public CalculatorController(CalculatorService calculatorService) {
	this.calculatorService = calculatorService;
}
@GetMapping("/add")
public double add(@RequestParam(defaultValue = "0") double a, @RequestParam(defaultValue = "0") double b) {
    return a + b;
}

@GetMapping("/subtract")  
public double subtract(@RequestParam double a, @RequestParam double b) {  // 13. Reads query parameters "a" and "b".
    return calculatorService.subtract(a, b);  // 14. Calls the subtractNumbers method and returns the result.
}

// 15. HTTP GET method for the multiplication operation.
@GetMapping("/multiply")  
public double multiply(@RequestParam double a, @RequestParam double b) {  // 16. Reads query parameters "a" and "b".
    return calculatorService.multiply(a, b);  // 17. Calls the multiplyNumbers method and returns the result.
}

// 18. HTTP GET method for the division operation.
@GetMapping("/divide")  
public double divide(@RequestParam double a, @RequestParam double b) {  // 19. Reads query parameters "a" and "b".
    return calculatorService.divide(a, b);  // 20. Calls the divideNumbers method and returns the result.
}


}
