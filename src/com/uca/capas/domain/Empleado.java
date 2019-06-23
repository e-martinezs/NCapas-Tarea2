package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="empleado")
public class Empleado {

	@Id
	@GeneratedValue(generator="empleado_id_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="empleado_id_seq", sequenceName="public.empleado_id_seq", allocationSize=1)
	@Column(name="id")
	private Integer id;
	
	@NotEmpty(message="Este campo no puede ir vacio")
	@Size(max=30, message="La longitud debe estar entre 0 y 30")
	@Column(name="nombre")
	private String nombre;
	
	@NotNull(message="Este campo no puede ir vacio")
	@Min(value=0, message="No puede ser negativo")
	@Column(name="edad")
	private Integer edad;
	
	@NotNull(message="Este campo no puede ir vacio")
	@Column(name="genero")
	private char genero;
	
	@NotNull(message="Este campo no puede ir vacio")
	@Column(name="estado")
	private Boolean estado;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sucursal")
	private Sucursal sucursal;
	
	public Empleado() {
		
	}

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
	
	public String getEstadoDelegate() {
		if (estado) {
			return "Activo";
		}else {
			return "Inactivo";
		}
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
}
