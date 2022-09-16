package ru.ainur.calculator.services;

import org.springframework.stereotype.Service;
import ru.ainur.calculator.interfaces.CalculatorServiceInterface;
import ru.ainur.calculator.exceptions.DivideByZeroException;
import ru.ainur.calculator.exceptions.EmptyArgumentException;

@Service
public class CalculatorService implements CalculatorServiceInterface {

    public String helloCalculator() {
        return "<h1><p align=\"center\">Добро пожаловать в калькулятор</p><h1>";
    }

    public int plus(String numberOne, String numberTwo) {
        if (valideStringToInt(numberOne) == false || valideStringToInt(numberTwo) == false) {
            throw new EmptyArgumentException("Не задано одно из чискл");
        }
        int numberOneInt = Integer.parseInt(numberOne);
        int numberTwoInt = Integer.parseInt(numberTwo);
        return numberOneInt + numberTwoInt;
    }

    public int minus(String numberOne, String numberTwo) {
        if (valideStringToInt(numberOne) == false || valideStringToInt(numberTwo) == false) {
            throw new EmptyArgumentException("Не задано одно из чискл");
        }
        int numberOneInt = Integer.parseInt(numberOne);
        int numberTwoInt = Integer.parseInt(numberTwo);
        return numberOneInt - numberTwoInt;
    }

    public int multiply(String numberOne, String numberTwo) {
        if (valideStringToInt(numberOne) == false || valideStringToInt(numberTwo) == false) {
            throw new EmptyArgumentException("Не задано одно из чискл");
        }
        int numberOneInt = Integer.parseInt(numberOne);
        int numberTwoInt = Integer.parseInt(numberTwo);
        return numberOneInt * numberTwoInt;
    }

    public double divide(String numberOne, String numberTwo) {
        if (valideStringToInt(numberOne) == false || valideStringToInt(numberTwo) == false) {
            throw new EmptyArgumentException("Не задано одно из чискл");
        }
        int numberOneInt = Integer.parseInt(numberOne);
        int numberTwoInt = Integer.parseInt(numberTwo);
        if (numberTwoInt == 0) {
            throw new DivideByZeroException("На ноль делить нельзя");
        }
        double result = (double) numberOneInt / numberTwoInt;
        return result;
    }

    private boolean valideStringToInt(String string) {
        if (string == "") {
            return false;
        }
        char[] stringInCharArray = string.toCharArray();

        for (char temp : stringInCharArray) {
            if ((int) temp < 48 || (int) temp > 57) {
                return false;
            }
        }
        return true;
    }
}
