package br.com.petz.clientepetz.pet.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petz.clientepetz.pet.domain.Pet;

public interface PetSpringJPARepository extends JpaRepository<Pet, UUID>{

}
