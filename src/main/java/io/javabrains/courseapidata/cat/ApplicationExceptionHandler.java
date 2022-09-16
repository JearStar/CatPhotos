package io.javabrains.courseapidata.cat;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(BadStringException.class)
    public ResponseEntity<Error> handleException(BadStringException e) {
        Error error = new Error(HttpStatus.BAD_REQUEST, e.getMessage());
        return new ResponseEntity<>(error, error.getHttpStatus());
    }
}
