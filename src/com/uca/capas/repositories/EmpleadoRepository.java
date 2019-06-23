package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.domain.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{

	public List<Empleado> findAll();
	
	public List<Empleado> findByOrderByIdAsc();
}
