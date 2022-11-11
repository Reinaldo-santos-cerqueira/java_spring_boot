package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetTestController {
	
	private static final String frase = "Teste de get";
	
	@RequestMapping("/getTeste")
	public GetTest getTest(
		@RequestParam( 
				value = "email",defaultValue = "reinaldo,santos@sgnsistemas.com.br")String email,
		@RequestParam(
				value = "nome",defaultValue = "Reinaldo Santos")String nome
	) {
		return new GetTest(String.format(nome), String.format(email), String.format(frase));
	}
	
}
