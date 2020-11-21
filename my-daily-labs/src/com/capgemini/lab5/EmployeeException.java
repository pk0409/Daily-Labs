package com.capgemini.lab5;

@SuppressWarnings("serial")
public class EmployeeException extends Exception{

	private String message;


	public EmployeeException() {

	}

	public EmployeeException(String message) {
		this.message=message;
	}

	public String getMessage() {
		return this.message;
	}
}
