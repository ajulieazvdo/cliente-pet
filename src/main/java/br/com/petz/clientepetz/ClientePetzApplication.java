package br.com.petz.clientepetz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientePetzApplication {
	@GetMapping
	public String getHomeTest() {
		return "Cliente Pet - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientePetzApplication.class, args);
	}

}
