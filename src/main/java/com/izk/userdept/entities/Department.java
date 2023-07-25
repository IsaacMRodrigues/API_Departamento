package com.izk.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //mostra pro programa que isso vai ser uma entidade no banco de dados
@Table(name = "tb_department") //cria a tabela no banco com esses nomes
public class Department  {
	
	@Id // mostra que vai ser a chave primaria (não se repete)
	@GeneratedValue(strategy = GenerationType.IDENTITY) //gerar um valor para o ID automaticamente
	private Long id;
	private String name;
	
	public Department() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
