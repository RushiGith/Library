package com.velocity.library.exception;

public enum Errorcode {

	DATA_NOT_FOUND("001","data is not availabe in database"),INVLIDE_ID("002","REQUESTING ID IS NOT PRESENT IN DATA BASE");
	private final String code;
	private final String message;
	
	Errorcode (String code,String message){
		this.code=code;
		this.message=message;
		}
	
	public String getcode() {
		return code;
	}
	
	public String getmessage() {
		return message;
	}
}
