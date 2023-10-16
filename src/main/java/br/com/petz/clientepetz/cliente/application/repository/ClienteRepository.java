package br.com.petz.clientepetz.cliente.application.repository;

import br.com.petz.clientepetz.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}
