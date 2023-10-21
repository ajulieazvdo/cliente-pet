package br.com.petz.clientepetz.pet.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepetz.pet.application.service.PetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@RestController
@Log4j2
@RequiredArgsConstructor
public class PetController implements PetAPI {

	private final PetService petService;

	@Override
	public PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[inicia] PetController - postPet");
		log.info("[idCliente] {}", idCliente);
		PetResponse pet = petService.criaPet(idCliente, petRequest);
		log.info("[finaliza] PetController - postPet");
		return pet;
	}

	@Override
	public List<PetClienteListResponse> getPetsDoClienteComId(UUID idCliente) {
		log.info("[inicia] PetController - getPetsDoClienteComId");
		log.info("[idCliente] {}", idCliente);
		List<PetClienteListResponse> petsDoCliente = petService.buscaPetsDoClienteComId(idCliente);
		log.info("[finish] PetController - getPetsDoClienteComId");
		return petsDoCliente;
	}

	@Override
	public PetClienteDetalheResponse getPetDoClienteComId(UUID idCliente, UUID idPet) {
		log.info("[inicia] PetController - getPetDoClienteComId");
		log.info("[idCliente] {} - [idPet] {}", idCliente, idPet);		
		PetClienteDetalheResponse pet = petService.buscaPetDoClienteComId(idCliente, idPet);
		log.info("[inicia] PetController - getPetDoClienteComId");
		return pet;
	}

	@Override
	public void deletePetDoClienteComId(UUID idCliente, UUID idPet) {
		log.info("[inicia] PetController - deletePetDoClienteComId");
		log.info("[idCliente] {} - [idPet] {}", idCliente, idPet);
		petService.deletaPetDoClienteComId(idCliente, idPet);
		log.info("[finaliza] PetController - deletePetDoClienteComId");
		
	}

}
