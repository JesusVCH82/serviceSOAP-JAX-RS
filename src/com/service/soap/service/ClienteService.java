package com.service.soap.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import com.service.soap.exceptions.ApiSOAPException;
import com.service.soap.exceptions.GenericException;
import com.service.soap.models.Cliente;

@WebService
public interface ClienteService {
	
	@WebMethod(operationName = "getClients")
	@WebResult(name = "Cliente")
	public List<Cliente> getClients();
	
	@WebMethod(operationName = "getClient")
	@WebResult(name = "Cliente")
	public Cliente getClient(@WebParam(name = "id")int id);
	
	@WebMethod(operationName = "createClient")
	@WebResult(name = "message")
	public String createClient( @WebParam(name = "Cliente")Cliente cliente);
	
	@WebMethod(operationName = "updateClient")
	@WebResult(name = "message")
	public String updateClient(@WebParam(name = "id") int id, @WebParam(name = "Cliente") @XmlElement( required = true )  Cliente cliente);
	
	@WebMethod(operationName = "deleteClient")
	@WebResult(name = "message")
	public String deleteClient(@WebParam(name = "id") @XmlElement( required = true ) int id) throws GenericException, ApiSOAPException;

}
