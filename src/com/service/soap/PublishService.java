package com.service.soap;

import javax.xml.ws.Endpoint;

import com.service.soap.service.impl.ClienteServiceImpl;

public class PublishService {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8080/serviceSOAP-JAX-WS/Cliente", new ClienteServiceImpl());
		System.out.println("Ok");
	}

}
