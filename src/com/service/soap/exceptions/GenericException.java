package com.service.soap.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "GenericException")
public class GenericException extends Exception {

	private static final long serialVersionUID = 1L;
	private ApiSOAPException apiSOAPException;

	public GenericException(String message, ApiSOAPException faultInfo) {
		super(message);
	}

	public GenericException(String message, ApiSOAPException faultInfo, Throwable cause) {
		super(message, cause);
	}

	public ApiSOAPException getFaultInfo() {
		return apiSOAPException;
	}

}
