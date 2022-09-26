package com.nikhilsnayak3473.springbootdemo.exception;

public class NoIdFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String msg;
	
	
	public NoIdFoundException(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}

}
