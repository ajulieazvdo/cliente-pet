package br.com.petz.clientepetz.pet.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.petz.clientepetz.pet.domain.Pet;

public interface PetRepository {
	Pet salvaPet(Pet pet);
	List<Pet> buscaPetsDoClienteComId(UUID idCliente);


}
