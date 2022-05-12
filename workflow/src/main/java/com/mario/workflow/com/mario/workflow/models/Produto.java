package com.mario.workflow.com.mario.workflow.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Produto {

	/* ID -> dentificador – gerado automaticamente/*/
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String codigo;

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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}	
}
