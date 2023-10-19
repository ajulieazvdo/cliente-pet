package br.com.petz.clientepetz.handler;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class ErrorApiResponse {
	private String message;
	
	@JsonInclude(content = Include.NON_EMPTY)
	private String description;
}
