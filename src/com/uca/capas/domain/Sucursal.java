package com.uca.capas.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="sucursal")
public class Sucursal {

	@Id
	@GeneratedValue(generator="sucursal_id_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="sucursal_id_seq", sequenceName="public.sucursal_id_seq", allocationSize=1)
	@Column(name="id")
	private Integer id;
	
	@NotEmpty(message="Este campo no puede ir vacio")
	@Size(max=30, message="La longitud debe estar entre 0 y 30")
	@Column(name="nombre")
	private String nombre;
	
	@NotEmpty(message="Este campo no puede ir vacio")
	@Size(max=30, message="La longitud debe estar entre 0 y 30")
	@Column(name="ubicacion")
	private String ubicacion;
	
	@NotEmpty(message="Este campo no puede ir vacio")
	@Column(name="horario_apertura")
	private String horarioApertura;
	
	@NotEmpty(message="Este campo no puede ir vacio")
	@Column(name="horario_cierre")
	private String horarioCierre;
	
	@NotNull(message="Este campo no puede ir vacio")
	@Min(value=0, message="No puede ser negativo")
	@Column(name="nmesas")
	private Integer nMesas;
	
	@NotEmpty(message="Este campo no puede ir vacio")
	@Size(max=30, message="La longitud debe estar entre 0 y 30")
	@Column(name="nomgerente")
	private String nomGerente;
	
	@OneToMany(mappedBy="sucursal", fetch=FetchType.LAZY)
	private List<Empleado> empleados;
	
	public Sucursal() {
		
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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getHorarioApertura() {
		return horarioApertura;
	}

	public void setHorarioApertura(String horarioApertura) {
		this.horarioApertura = horarioApertura;
	}

	public String getHorarioCierre() {
		return horarioCierre;
	}

	public void setHorarioCierre(String horarioCierre) {
		this.horarioCierre = horarioCierre;
	}

	public Integer getnMesas() {
		return nMesas;
	}

	public void setnMesas(Integer nMesas) {
		this.nMesas = nMesas;
	}

	public String getNomGerente() {
		return nomGerente;
	}

	public void setNomGerente(String nomGerente) {
		this.nomGerente = nomGerente;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
}
