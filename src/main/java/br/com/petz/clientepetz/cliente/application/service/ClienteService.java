package br.com.petz.clientepetz.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.petz.clientepetz.cliente.application.api.ClienteAlteracaoRequest;
import br.com.petz.clientepetz.cliente.application.api.ClienteDetalhadoResponse;
import br.com.petz.clientepetz.cliente.application.api.ClienteListResponse;
import br.com.petz.clientepetz.cliente.application.api.ClienteRequest;
import br.com.petz.clientepetz.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
	void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);
}
