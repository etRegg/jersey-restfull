package com.mregg.main.model;

import javax.persistence.Entity;
import javax.persistence.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity

public class Campagning {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String texto;

	public Long getId() {
		return id;
	}

	@NotNull(message = "{'first name'}")
    @Length(min = 2, max = 20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotNull(message = "{'first name'}")
    @Length(min = 2, max = 244)
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@ManyToOne()
	private Customer customer;
}
