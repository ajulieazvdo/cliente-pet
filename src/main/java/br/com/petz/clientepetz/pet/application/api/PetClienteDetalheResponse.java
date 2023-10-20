package br.com.petz.clientepetz.pet.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.petz.clientepetz.pet.domain.Porte;
import br.com.petz.clientepetz.pet.domain.SexoPet;
import br.com.petz.clientepetz.pet.domain.TipoPet;
import lombok.Value;
@Value
public class PetClienteDetalheResponse {
	private UUID idPet;
	private UUID idClienteTutor;
	private String nomePet;
	private Porte porte;
	private TipoPet tipoPet;
	private String microship;
	private String raca;
	private SexoPet sexo;
	private String pelagemCor;
	private LocalDate dataNascimento;
	private String rga;
	private Integer peso;

}
