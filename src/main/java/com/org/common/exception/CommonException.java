package com.org.common.exception;

public class CommonException extends Throwable {

	private static final long serialVersionUID = 1L;

	private String message;

	public CommonException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
