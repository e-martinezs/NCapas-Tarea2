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

@Entity
@Table(schema="public", name="sucursal")
public class Sucursal {

	@Id
	@GeneratedValue(generator="sucursal_id_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="sucursal_id_seq", sequenceName="public.sucursal_id_seq", allocationSize=1)
	@Column(name="id")
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="ubicacion")
	private String ubicacion;
	
	@Column(name="horario_apertura")
	private String horarioApertura;
	
	@Column(name="horario_cierre")
	private String horarioCierre;
	
	@Column(name="nmesas")
	private Integer nMesas;
	
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
