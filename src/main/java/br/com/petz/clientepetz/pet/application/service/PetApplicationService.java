package br.com.petz.clientepetz.pet.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.petz.clientepetz.cliente.application.service.ClienteService;
import br.com.petz.clientepetz.pet.application.api.PetRequest;
import br.com.petz.clientepetz.pet.application.api.PetResponse;
import br.com.petz.clientepetz.pet.application.repository.PetRepository;
import br.com.petz.clientepetz.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class PetApplicationService implements PetService {
	
	private final ClienteService clienteService;
	private final PetRepository petRepository;
	@Override
	public PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[start] PetApplicationService - criaPet");
		clienteService.buscaClienteAtravesId(idCliente);
		Pet pet = petRepository.salvaPet(new Pet(idCliente, petRequest));
		log.info("[finish] PetApplicationService - criaPet");
		return new PetResponse(pet.getIdPet());
	}

}
