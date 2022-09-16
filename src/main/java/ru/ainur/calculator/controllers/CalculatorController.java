package ru.ainur.calculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ainur.calculator.services.CalculatorServiceInterface;

@RestController
@RequestMapping(path = "calculator")
public class CalculatorController {

    final private CalculatorServiceInterface calculatorService;

    public CalculatorController(CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String helloCalculator() {
        return "<h1><p align=\"center\">Добро пожаловать в калькулятор</p><h1>";
    }

    @GetMapping(path = "plus")
    public String plus(@RequestParam("num1") String numberOne, @RequestParam("num2") String numberTwo) {
        int numberOneInt = Integer.parseInt(numberOne);
        int numberTwoInt = Integer.parseInt(numberTwo);
        return "<h1><p align=\"center\">" + numberOne + "+" +
                numberTwo + "=" + calculatorService.plus(numberOneInt, numberTwoInt) + "</p><h1>";
    }

    @GetMapping(path = "minus")
    public String minus(@RequestParam("num1") String numberOne, @RequestParam("num2") String numberTwo) {
        int numberOneInt = Integer.parseInt(numberOne);
        int numberTwoInt = Integer.parseInt(numberTwo);
        return "<h1><p align=\"center\">" + numberOne + "-" +
                numberTwo + "=" + calculatorService.minus(numberOneInt, numberTwoInt) + "</p><h1>";
    }

    @GetMapping(path = "multiply")
    public String multiply(@RequestParam("num1") String numberOne, @RequestParam("num2") String numberTwo) {
        int numberOneInt = Integer.parseInt(numberOne);
        int numberTwoInt = Integer.parseInt(numberTwo);
        return "<h1><p align=\"center\">" + numberOne + "*" +
                numberTwo + "=" + calculatorService.multiply(numberOneInt, numberTwoInt) + "</p><h1>";
    }

    @GetMapping(path = "divide")
    public String divide(@RequestParam("num1") String numberOne, @RequestParam("num2") String numberTwo) {
        int numberOneInt = Integer.parseInt(numberOne);
        int numberTwoInt = Integer.parseInt(numberTwo);
        return "<h1><p align=\"center\">" + numberOne + "/" +
                numberTwo + "=" + calculatorService.divide(numberOneInt, numberTwoInt) + "</p><h1>";
    }
}
