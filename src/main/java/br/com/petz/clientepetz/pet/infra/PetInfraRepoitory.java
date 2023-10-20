package br.com.petz.clientepetz.pet.infra;

import org.springframework.stereotype.Repository;

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

}
