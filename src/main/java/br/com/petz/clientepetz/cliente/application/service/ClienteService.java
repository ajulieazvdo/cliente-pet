package br.com.petz.clientepetz.cliente.application.service;

import br.com.petz.clientepetz.cliente.application.api.ClienteRequest;
import br.com.petz.clientepetz.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
