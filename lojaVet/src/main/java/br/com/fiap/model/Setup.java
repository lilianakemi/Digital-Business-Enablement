package br.com.fiap.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Setup {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String name;
	private String date;
	private String email; 
	private BigDecimal senha;

	private String description;
	
	
	public Setup() {
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getSenha() {
		return senha;
	}


	public void setSenha(BigDecimal senha) {
		this.senha = senha;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

	

	public Long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Setup [id=" + id + ", name=" + name + ", date=" + date + ", email=" + email + ", senha=" + senha
				+ ", description=" + description + "]";
	}
	}
