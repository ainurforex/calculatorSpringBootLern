package ru.ainur.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "calculator")
public class CalculatorController {

    final private CalculatorServiceInterface calculatorService;

    public CalculatorController(CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping(path = "plus")
    public String plus(@RequestParam("num1") String numberOne, @RequestParam("num2") String numberTwo) {
        return calculatorService.plus(numberOne, numberTwo);
    }

    @GetMapping(path = "minus")
    public String minus(@RequestParam("num1") String numberOne, @RequestParam("num2") String numberTwo) {
        return calculatorService.minus(numberOne, numberTwo);
    }

    @GetMapping(path = "multiply")
    public String multiply(@RequestParam("num1") String numberOne, @RequestParam("num2") String numberTwo) {
        return calculatorService.multiply(numberOne, numberTwo);
    }

    @GetMapping(path = "divide")
    public String divide(@RequestParam("num1") String numberOne, @RequestParam("num2") String numberTwo) {
        return calculatorService.divide(numberOne, numberTwo);
    }

}
