package br.com.petz.clientepetz.pet.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.petz.clientepetz.pet.application.api.PetClienteDetalheResponse;
import br.com.petz.clientepetz.pet.application.api.PetClienteListResponse;
import br.com.petz.clientepetz.pet.application.api.PetRequest;
import br.com.petz.clientepetz.pet.application.api.PetResponse;

public interface PetService {
	PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);
	List<PetClienteListResponse> buscaPetsDoClienteComId(UUID idCliente);
	PetClienteDetalheResponse buscaPetDoClienteComId(UUID idCliente, UUID idPet);
	void deletaPetDoClienteComId(UUID idCliente, UUID idPet);

}
