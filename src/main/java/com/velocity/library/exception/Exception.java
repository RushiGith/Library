package com.velocity.library.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exception {
	@ExceptionHandler(Resourcenotfoundexception.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Errorresponse handleResourcenotfoundexception(Resourcenotfoundexception ex) {
		
		
	Errorresponse errorresponse=new Errorresponse();
	errorresponse.setCode(ex.getcode());
	errorresponse.setMessage(ex.getMessage());
		
		return errorresponse;
		
	}
	@ExceptionHandler(Throwable.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public Errorresponse handleException(Throwable ex) {
		Errorresponse errorresponse=new Errorresponse();
		errorresponse.setCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
		errorresponse.setMessage("Dosent Match to contain");
		return errorresponse;
		
	}

}
