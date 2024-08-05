package com.test.exception1.exception;

public class IdNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	String message;
	
	public IdNotFoundException(String message)
	{
		this.message=message;
	}

	public String getMessage() {
		
		return null;
	}
	public void setMessage(String message)
	{
		this.message=message;
	}

	
}
