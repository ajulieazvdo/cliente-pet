package br.com.petz.clientepetz.cliente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.petz.clientepetz.cliente.domain.Cliente;

public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		// TODO Auto-generated method stub
		return null;
	}
}
