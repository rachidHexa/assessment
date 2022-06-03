package com.hexa.assessment.myexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetails> resourceNotFound(ResourceNotFoundException ex) {
        ErrorDetails response = new ErrorDetails();
        response.setErrorMessage(ex.getMessage());
        return new ResponseEntity<ErrorDetails>(response, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ErrorDetails> unauthorizedException(UnauthorizedException ex) {
        ErrorDetails response=new ErrorDetails();
        response.setErrorMessage(ex.getMessage());

        return new ResponseEntity<ErrorDetails>(response, HttpStatus.UNAUTHORIZED);
    }
}
