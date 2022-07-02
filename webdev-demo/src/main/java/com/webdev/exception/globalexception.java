package com.webdev.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@Slf4j
@ControllerAdvice
public class globalexception {

    @ExceptionHandler({ArithmeticException.class, NullPointerException.class, IllegalArgumentException.class})
    public String handleArithHandler(Exception e) {

        log.error("Error: {}", e);
        return "login";
    }
}
