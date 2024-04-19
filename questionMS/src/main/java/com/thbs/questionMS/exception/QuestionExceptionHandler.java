package com.thbs.questionMS.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class QuestionExceptionHandler {

    @ExceptionHandler(QuestionNotFoundException.class)
    public ResponseEntity<String> questionNotFoundException(QuestionNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(SubjectNotFoundException.class)
    public ResponseEntity<String> subjectNotFoundException(SubjectNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
    }





}
