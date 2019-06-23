package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Empleado;
import com.uca.capas.dto.EmpleadoDTO;

public interface EmpleadoService {

	public List<Empleado> findAll();
	
	public Empleado findById(int id);
	
	public Empleado save(EmpleadoDTO e);
	
	public void delete(Empleado e);
}
