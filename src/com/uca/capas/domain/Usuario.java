package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(generator="usuario_id_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="usuario_id_seq", sequenceName="public.usuario_id_seq", allocationSize=1)
	@Column(name="id")
	private Integer id;
	
	@NotEmpty(message="Este campo no puede ir vacio")
	@Size(max=30, message="La longitud debe estar entre 0 y 30")
	@Column(name="username")
	private String username;
	
	@NotEmpty(message="Este campo no puede ir vacio")
	@Size(max=30, message="La longitud debe estar entre 0 y 30")
	@Column(name="password")
	private String password;
	
	public Usuario() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
