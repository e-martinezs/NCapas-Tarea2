package com.uca.capas.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmpleadoDTO {

	private Integer id;
	
	@NotEmpty(message="Este campo no puede ir vacio")
	@Size(max=30, message="La longitud debe estar entre 0 y 30")
	private String nombre;
	
	@NotNull(message="Este campo no puede ir vacio")
	@Min(value=0, message="No puede ser negativo")
	private Integer edad;
	
	@NotNull(message="Este campo no puede ir vacio")
	private char genero;
	
	@NotNull(message="Este campo no puede ir vacio")
	private Boolean estado;
	
	private Integer sucursalId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Integer getSucursalId() {
		return sucursalId;
	}

	public void setSucursalId(Integer sucursalId) {
		this.sucursalId = sucursalId;
	}
}
