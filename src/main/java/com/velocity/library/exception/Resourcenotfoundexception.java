package com.velocity.library.exception;

public class Resourcenotfoundexception extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public final String code;
	
	public Resourcenotfoundexception(String code,String message) {
		super(message);
		this.code=code;
	}
	public String getcode() {
		return code;
	}

}
