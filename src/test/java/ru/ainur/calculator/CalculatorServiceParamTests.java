package ru.ainur.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.ainur.calculator.services.CalculatorService;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static ru.ainur.calculator.Constats.*;

public class CalculatorServiceParamTests {
    private final CalculatorService calculatorService = new CalculatorService();



    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSummCorrectly(int a, int b) {
        int result = calculatorService.plus(a, b);
        assertEquals(a + b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSubstractCorrectly(int a, int b) {
        int result = calculatorService.minus(a, b);
        assertEquals(a - b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMultiplyCorrectly(int a, int b) {
        int result = calculatorService.multiply(a, b);
        assertEquals(a * b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldDivideCorrectly(int a, int b) {
        double result = calculatorService.divide(a, b);
        assertEquals((double) a / b, result);
    }


    private static Stream<Arguments> provideCalculatorParams() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, TWO),
                Arguments.of(TWO, THREE),
                Arguments.of(ZERO, TWO)
        );


    }

}

