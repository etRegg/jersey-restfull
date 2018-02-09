package com.mregg.main.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	public int getId() {
		return id;
	}


	@NotNull(message = "{'first name'}")
    @Length(min = 2, max = 20)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@NotNull(message = "{'first name'}")
    @Length(min = 2, max = 20)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String lastName;

	@OneToMany()
	public Set<Campagning> campagnings;

	protected Customer() {

	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}

}