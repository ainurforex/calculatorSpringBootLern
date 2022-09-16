package ru.ainur.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ainur.calculator.exceptions.DivideByZeroException;
import ru.ainur.calculator.services.CalculatorService;

import static ru.ainur.calculator.Constats.*;

public class CalculatorServiceTests {
    private final CalculatorService calculatorService = new CalculatorService();
    @Test
    public void shouldReturnTwoWhenSummOneAndOne() {

        int actual = ONE + ONE;
        int excepted = (calculatorService.plus(ONE , ONE ));
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void shouldReturnTwoWhenSumOneAndTwo() {

        int actual = ONE + TWO;
        int excepted = (calculatorService.plus(ONE, TWO));
        Assertions.assertEquals(excepted, actual);
    }
    @Test
    public void shouldReturnTwoWhenSubstractTwoAndOne() {

        int actual = TWO - ONE;
        int excepted = (calculatorService.minus(TWO , ONE));
        Assertions.assertEquals(excepted, actual);
    }
    @Test
    public void shouldReturnTwoWhenSubstractOneAndOne() {

        int actual = ONE - ONE;
        int excepted = (calculatorService.minus(ONE , ONE));
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void shouldReturnTwoWhenMultiplyOneAndOne() {

        int actual = ONE * ONE;
        int excepted = (calculatorService.multiply(ONE, ONE));
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void shouldReturnTwoWhenMultiplyTwoAndOne() {

        int actual = TWO * ONE;
        int excepted = (calculatorService.multiply(TWO , ONE));
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void shouldReturnTwoWhenDivideOneAndOne() {

        double actual = ONE / ONE;
        double excepted = (calculatorService.divide(ONE , ONE));
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void shouldReturnTwoWhenDivideTwoAndOne() {

        double actual = TWO / ONE;
        double excepted = (calculatorService.divide(TWO , ONE ));
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void shouldThrowDivizonByZeroExceptionWhenivizionByZero() {
        Assertions.assertThrows(DivideByZeroException.class,()->calculatorService.divide(ONE,ZERO));
    }

}
