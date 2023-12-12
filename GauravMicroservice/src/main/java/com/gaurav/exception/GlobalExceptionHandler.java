package com.gaurav.exception;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.core.env.Environment;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@Autowired
	private Environment enviroment;

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorMessage> employeeNotFoundException(EmployeeNotFoundException ex) {
		ErrorMessage er = new ErrorMessage();
		er.setErroCode(HttpStatus.BAD_REQUEST.value());
		er.setMessage(ex.getMessage());
		return new ResponseEntity<ErrorMessage>(er, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> generalException(Exception ex) {
		ErrorMessage er = new ErrorMessage();
		er.setErroCode(HttpStatus.BAD_REQUEST.value());
		er.setMessage(ex.getMessage());
		return new ResponseEntity<ErrorMessage>(er, HttpStatus.BAD_REQUEST);
	}

	// address exception class
	@ExceptionHandler(AddressNotFoundException.class)
	public ResponseEntity<ErrorMessage> addressNotFoundException(AddressNotFoundException ex) {
		ErrorMessage er = new ErrorMessage();
		er.setErroCode(HttpStatus.NOT_FOUND.value());
		er.setMessage(enviroment.getProperty(ex.getMessage()));
		return new ResponseEntity<ErrorMessage>(er, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorMessage> exceptionHandler(MethodArgumentNotValidException ex) {
		ErrorMessage er = new ErrorMessage();
		String errMessage=ex.getBindingResult().getAllErrors().stream().map(x->x.getDefaultMessage()).collect(Collectors.joining(","));
		er.setErroCode(HttpStatus.NOT_FOUND.value());
		er.setMessage(errMessage);
		return new ResponseEntity<ErrorMessage>(er, HttpStatus.NOT_FOUND);
	}

}
