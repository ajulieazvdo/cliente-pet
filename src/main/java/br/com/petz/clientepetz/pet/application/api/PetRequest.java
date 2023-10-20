package br.com.petz.clientepetz.pet.application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.petz.clientepetz.pet.domain.Porte;
import br.com.petz.clientepetz.pet.domain.SexoPet;
import br.com.petz.clientepetz.pet.domain.TipoPet;
import lombok.Value;
@Value
public class PetRequest {
	@NotBlank
	private String nomePet;
	private Porte porte;
	@NotNull
	private TipoPet tipoPet;
	private String microship;
	@NotBlank
	private String raca;
	@NotNull
	private SexoPet sexo;
	private String pelagemCor;
	@NotNull
	private LocalDate dataNascimento;
	private String rga;
	private Integer peso;
}
