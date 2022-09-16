package ru.ainur.calculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ainur.calculator.interfaces.CalculatorServiceInterface;

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
        System.out.println("ss");
        return "<h1><p align=\"center\">" + numberOne + "+" + numberTwo + "=" + calculatorService.plus(numberOne, numberTwo) + "</p><h1>";
    }

    @GetMapping(path = "minus")
    public String minus(@RequestParam("num1") String numberOne, @RequestParam("num2") String numberTwo) {
        return "<h1><p align=\"center\">" + numberOne + "-" + numberTwo + "=" + calculatorService.minus(numberOne, numberTwo) + "</p><h1>";
    }

    @GetMapping(path = "multiply")
    public String multiply(@RequestParam("num1") String numberOne, @RequestParam("num2") String numberTwo) {
        return "<h1><p align=\"center\">" + numberOne + "*" + numberTwo + "=" + calculatorService.multiply(numberOne, numberTwo) + "</p><h1>";
    }

    @GetMapping(path = "divide")
    public String divide(@RequestParam("num1") String numberOne, @RequestParam("num2") String numberTwo) {
        return "<h1><p align=\"center\">" + numberOne + "/" + numberTwo + "=" + calculatorService.divide(numberOne, numberTwo) + "</p><h1>";
    }
}
