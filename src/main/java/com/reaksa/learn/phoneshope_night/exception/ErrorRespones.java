package com.reaksa.learn.phoneshope_night.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorRespones {
	private HttpStatus httpStatus;
	private String message;

}
