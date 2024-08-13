package com.reaksa.learn.phoneshope_night.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExeption {
	@ExceptionHandler(ApiException.class)
	public ResponseEntity<?> handleApiException(ApiException e){
		ErrorRespones errorRespones = new ErrorRespones(e.getHttpStatus(), e.getMessage());
		return ResponseEntity
				.status(e.getHttpStatus())
				.body(errorRespones);
	}
}
