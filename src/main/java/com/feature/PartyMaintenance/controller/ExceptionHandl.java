package com.feature.PartyMaintenance.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestController
@ControllerAdvice
public class ExceptionHandl extends ResponseEntityExceptionHandler
{

 
   @ExceptionHandler(Exception.class)
   @Override
   protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//      ExceptionResponse eResp = new ExceptionResponse(new Date(), "Validation failed",ex.getBindingResult().getFieldError("name").toString());
//      return new ResponseEntity(eResp,HttpStatus.BAD_REQUEST);
      return handleExceptionInternal(ex, "Validation", new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
      }
}
