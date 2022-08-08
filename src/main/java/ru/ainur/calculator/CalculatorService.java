package ru.ainur.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {

    public String helloCalculator() {
        return "<h1><p align=\"center\">Добро пожаловать в калькулятор</p><h1>";
    }

    public String plus(String numberOne, String numberTwo) {
        if (valideStringToInt(numberOne) == false || valideStringToInt(numberTwo) == false) {
            return notNumber();
        }
        int numberOneInt = Integer.parseInt(numberOne);
        int numberTwoInt = Integer.parseInt(numberTwo);
        int result = numberOneInt + numberTwoInt;
        return "<h1><p align=\"center\">" + numberOneInt + "+" + numberTwoInt + "=" + result + "</p><h1>";
    }

    public String minus(String numberOne, String numberTwo) {
        if (valideStringToInt(numberOne) == false || valideStringToInt(numberTwo) == false) {
            return notNumber();
        }
        int numberOneInt = Integer.parseInt(numberOne);
        int numberTwoInt = Integer.parseInt(numberTwo);
        int result = numberOneInt - numberTwoInt;
        return "<h1><p align=\"center\">" + numberOneInt + "-" + numberTwoInt + "=" + result + "</p><h1>";
    }

    public String multiply(String numberOne, String numberTwo) {
        if (valideStringToInt(numberOne) == false || valideStringToInt(numberTwo) == false) {
            return notNumber();
        }
        int numberOneInt = Integer.parseInt(numberOne);
        int numberTwoInt = Integer.parseInt(numberTwo);
        int result = numberOneInt * numberTwoInt;
        return "<h1><p align=\"center\">" + numberOneInt + "*" + numberTwoInt + "=" + result + "</p><h1>";
    }

    public String divide(String numberOne, String numberTwo) {
        if (valideStringToInt(numberOne) == false || valideStringToInt(numberTwo) == false) {
            return notNumber();
        }
        int numberOneInt = Integer.parseInt(numberOne);
        int numberTwoInt = Integer.parseInt(numberTwo);
        if (numberTwoInt == 0) {
            return divideZero();
        }
        double result = (double) numberOneInt / numberTwoInt;
        return "<h1><p align=\"center\">" + numberOneInt + "/" + numberTwoInt + "=" + result + "</p><h1>";
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

    private String notNumber() {
        return "<h1><p align=\"center\">Ошибка! Не задано число.</p><h1>";
    }

    private String divideZero() {
        return "<h1><p align=\"center\">Ошибка! На ноль делить нельзя</p><h1>";
    }

}
