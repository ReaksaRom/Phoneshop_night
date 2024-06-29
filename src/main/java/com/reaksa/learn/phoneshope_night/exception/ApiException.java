package com.reaksa.learn.phoneshope_night.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ApiException extends RuntimeException {
	private final HttpStatus httpStatus;
	private final String message;

}
