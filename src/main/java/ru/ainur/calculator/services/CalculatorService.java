package ru.ainur.calculator.services;

import org.springframework.stereotype.Service;
import ru.ainur.calculator.exceptions.DivideByZeroException;

@Service
public class CalculatorService implements CalculatorServiceInterface {


    public int plus(int numberOne, int numberTwo) {

        return numberOne + numberTwo;
    }

    public int minus(int numberOne, int numberTwo) {

        return numberOne - numberTwo;
    }

    public int multiply(int numberOne, int numberTwo) {


        return numberOne * numberTwo;
    }

    public double divide(int numberOne, int numberTwo) {

       if (numberTwo == 0) {
            throw new DivideByZeroException("На ноль делить нельзя");
        }
        double result = (double) numberOne / numberTwo;
        return result;
    }

}
