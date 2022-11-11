package com.example.demo;

public class GetTest {
	private final String nome;
	private final String email;
	private final String teste;
	public String getEmail() {
		return email;
	}
	public String getNome() {
		return nome;
	}
	public String getTeste() {
		return teste;
	}
	public GetTest(String nome, String email, String teste) {
		super();
		this.nome = nome;
		this.email = email;
		this.teste = teste;
	}
}
