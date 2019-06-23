package com.uca.capas.dto;

public class EmpleadoDTO {

	private Integer id;
	
	private String nombre;
	
	private Integer edad;
	
	private String genero;
	
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
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
