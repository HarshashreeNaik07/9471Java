package com.demo.server.main.helloworld;
	public class HelloWorldBean   
	{  
	public String message;  
	
	public HelloWorldBean(String message)  
	{  
	this.message=message;  
	}  
	 
	public String getMessage()  
	{  
	return message;  
	}  
	public void setMessage(String message)   
	{  
	this.message = message;  
	}  
	@Override  
	 
	public String toString()   
	{  
	return String.format ("HelloWorldBean [message=%s]", message);  
	}  
	}  
