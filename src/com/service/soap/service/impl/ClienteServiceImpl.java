package com.service.soap.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.service.soap.exceptions.ApiSOAPException;
import com.service.soap.exceptions.GenericException;
import com.service.soap.models.Cliente;
import com.service.soap.service.ClienteService;

@WebService(endpointInterface = "com.service.soap.service.ClienteService")
public class ClienteServiceImpl implements ClienteService {
	
	List<Cliente> clientes = new ArrayList<>();
	
	public ClienteServiceImpl() {
		Cliente c = new Cliente(1, "Jesus", "Vazquez", 29, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cliente c1 = new Cliente(2, "Marco", "Polo", 49, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cliente c2 = new Cliente(3, "Gabriel", "Cardenas", 19, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cliente c3 = new Cliente(4, "Martin", "Cardenas", 79, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		clientes.add(c);
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);	
	}
	
	@Override
	public List<Cliente> getClients() {
		return clientes;
	}

	@Override
	public Cliente getClient(int id) {
		if(id > clientes.size() || id <= 0) {
			return new Cliente();
		}
		return clientes.get(id);
	}

	@Override
	public String createClient(Cliente cliente) {
		clientes.add(cliente);
		return "Se agrego el cliente con exito";
	}

	@Override
	public String updateClient(int id, Cliente cliente) {
		return "Se actualizo el cliente con exito";

	}

	@Override
	public String deleteClient(int id) throws  GenericException, ApiSOAPException {
		if(id > clientes.size() || id <= 0) {
			//throw new GenericException("100", "No se encontro el cliente:" + new NullPointerException().getCause().getMessage());
			//throw new GenericException("No se encontro el cliente", new ApiSOAPException());
			throw new ApiSOAPException("No se encontro el cliente", "99");
		}
		clientes.remove(id);
		return "Se elimino el cliente "+ id + "con exito";
	}

}
