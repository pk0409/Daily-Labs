package com.capgemini.lab5;

@SuppressWarnings("serial")
public class NameException extends Exception{

	private String message;

	public NameException()
	{

	}
	public NameException(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return this.message;
	}
}
