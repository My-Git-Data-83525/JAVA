package com.line.exception;

import com.line.check.ToLong;

public class ExceptionLineTooLong extends Exception {
	private String message;
	private String value;

	public ExceptionLineTooLong(String message, String value) {
		this.message = message;
		this.value = value;
	}

	@Override
	public void printStackTrace() {
		super.printStackTrace();
		System.err.println("Exception :" + message);
		System.err.println("ExceptionLineTooLong at feild :"+value);
	}
}
