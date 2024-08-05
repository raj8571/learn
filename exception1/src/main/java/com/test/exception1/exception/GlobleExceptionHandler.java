package com.test.exception1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice

public class GlobleExceptionHandler {
	@ExceptionHandler(IdNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public String idNotFoundException(IdNotFoundException ex)
	{
		return ex.getMessage();
	}

}
