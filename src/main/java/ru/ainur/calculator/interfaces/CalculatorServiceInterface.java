package ru.ainur.calculator.interfaces;

public interface CalculatorServiceInterface {
    String helloCalculator();

    int plus(String numberOne, String numberTwo);

    int minus(String numberOne, String numberTwo);

    int multiply(String numberOne, String numberTwo);

    double divide(String numberOne, String numberTwo);

}
