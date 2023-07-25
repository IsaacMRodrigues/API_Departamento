package com.izk.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity //mostra pro programa que isso vai ser uma entidade no banco de dados
@Table(name = "tb_user") //cria a tabela no banco com esses nomes
public class User {
	
	@Id // mostra que vai ser a chave primaria (não se repete)
	@GeneratedValue(strategy = GenerationType.IDENTITY) //gerar um valor para o ID automaticamente
	private Long id;
	private String name;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	public User() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
