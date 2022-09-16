package ru.ainur.calculator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DivideByZeroException extends IllegalArgumentException {

    public DivideByZeroException(String message) {
        super(message);
    }
}
