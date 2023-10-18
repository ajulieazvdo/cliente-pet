package br.com.petz.clientepetz.cliente.application.service;

import java.util.List;

import br.com.petz.clientepetz.cliente.application.api.ClienteListResponse;
import br.com.petz.clientepetz.cliente.application.api.ClienteRequest;
import br.com.petz.clientepetz.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
}
