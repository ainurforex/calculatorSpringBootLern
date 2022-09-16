package ru.ainur.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ainur.calculator.exceptions.DivideByZeroException;
import ru.ainur.calculator.services.CalculatorService;

public class CalculatorServiceTests {
    @Test
    public void plus() {
        CalculatorService calculatorService = new CalculatorService();
        int number1 = 1;
        int number2 = 2;
        int actual = number1 + number2;
        int excepted = (calculatorService.plus(number1 + "", number2 + ""));
        Assertions.assertEquals(excepted, actual);

        number1 = 44;
        number2 = 0;
        actual = number1 + number2;
        excepted = (calculatorService.plus(number1 + "", number2 + ""));
        Assertions.assertEquals(excepted, actual);

    }

    @Test
    public void minus() {
        CalculatorService calculatorService = new CalculatorService();
        int number1 = 10;
        int number2 = 2;
        int actual = number1 - number2;
        int excepted = (calculatorService.minus(number1 + "", number2 + ""));
        Assertions.assertEquals(excepted, actual);

        number1 = 44;
        number2 = 55;
        actual = number1 - number2;
        excepted = (calculatorService.minus(number1 + "", number2 + ""));
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void multiply() {
        CalculatorService calculatorService = new CalculatorService();
        int number1 = 10;
        int number2 = 33;
        int actual = number1 * number2;
        int excepted = (calculatorService.multiply(number1 + "", number2 + ""));
        Assertions.assertEquals(excepted, actual);

        number1 = 11;
        number2 = 0;
        actual = number1 * number2;
        excepted = (calculatorService.multiply(number1 + "", number2 + ""));
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void divide() {
        CalculatorService calculatorService = new CalculatorService();
        int number1 = 10;
        int number2 = 33;
        double actual = (double) number1 / number2;
        double excepted = (calculatorService.divide(number1 + "", number2 + ""));
        Assertions.assertEquals(excepted, actual);

        number1 = 12;
        number2 = 3;
        actual = number1 / number2;
        excepted = (calculatorService.divide(number1 + "", number2 + ""));
        Assertions.assertEquals(excepted, actual);

        number1 = 100;
        number2 = 0;
        try {
            excepted = (calculatorService.divide(number1 + "", number2 + ""));
            Assertions.assertFalse(true);
        } catch (DivideByZeroException e) {
            Assertions.assertNotEquals("", e.getLocalizedMessage());
        }
    }
}
