package com.example.projeto1.entity;

import java.util.Set;
import javax.persistence.*;

@Entity
public class User {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private String email;
	
	//Aquei neste Note estou criando um relacionamento entre as entidades
	//Que é um relacionamento de 1m para N
	@ManyToMany
	private Set<Role> roles;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
