package br.com.petz.clientepetz.pet.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.petz.clientepetz.handler.APIException;
import br.com.petz.clientepetz.pet.application.repository.PetRepository;
import br.com.petz.clientepetz.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class PetInfraRepoitory implements PetRepository {
	private final PetSpringJPARepository petSpringJPARepository;
	@Override
	public Pet salvaPet(Pet pet) {
		log.info("[start] PetInfraRepoitory - salvaPet");
		petSpringJPARepository.save(pet);
		log.info("[finish] PetInfraRepoitory - salvaPet");
		return pet;
	}
	@Override
	public List<Pet> buscaPetsDoClienteComId(UUID idCliente) {
		log.info("[start] PetInfraRepoitory - buscaPetsDoClienteComId");
		var pets = petSpringJPARepository.findByIdClienteTutor(idCliente);
		log.info("[finish] PetInfraRepoitory - buscaPetsDoClienteComId");		
		return pets;
	}
	@Override
	public Pet buscaPetPeloId(UUID idPet) {
		log.info("[start] PetInfraRepoitory - buscaPetPeloId");
		var pet = petSpringJPARepository.findById(idPet)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Pet não encontrado para o IDPet = "
						+ idPet));
		log.info("[finish] PetInfraRepoitory - buscaPetPeloId");		
		return pet;
	}
	@Override
	public void deletaPet(Pet pet) {
		log.info("[start] PetInfraRepoitory - deletaPet");		
		petSpringJPARepository.delete(pet);
		log.info("[finish] PetInfraRepoitory - deletaPet");		
	}

}
