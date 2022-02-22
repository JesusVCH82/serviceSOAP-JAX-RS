package com.service.soap.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name="ApiSOAPException")
public class ApiSOAPException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String message;
	private String code;
	
	public ApiSOAPException(String message, String code) {
		this.message = message;
		this.code = code;
	}
	public ApiSOAPException() {
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
}
