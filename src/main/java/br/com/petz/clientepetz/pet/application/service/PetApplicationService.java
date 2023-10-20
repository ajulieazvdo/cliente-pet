package br.com.petz.clientepetz.pet.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.petz.clientepetz.cliente.application.service.ClienteService;
import br.com.petz.clientepetz.pet.application.api.PetClienteDetalheResponse;
import br.com.petz.clientepetz.pet.application.api.PetClienteListResponse;
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
	@Override
	public List<PetClienteListResponse> buscaPetsDoClienteComId(UUID idCliente) {
		log.info("[start] PetApplicationService - buscaPetsDoClienteComId");
		clienteService.buscaClienteAtravesId(idCliente);
		List<Pet> petsDoCliente = petRepository.buscaPetsDoClienteComId(idCliente);
		log.info("[finaliza] PetApplicationService - buscaPetsDoClienteComId");
		return PetClienteListResponse.converte(petsDoCliente);
	}
	@Override
	public PetClienteDetalheResponse buscaPetDoClienteComId(UUID idCliente, UUID idPet) {
		log.info("[start] PetApplicationService - buscaPetDoClienteComId");
		log.info("[finaliza] PetApplicationService - buscaPetDoClienteComId");
		return null;
	}

}
