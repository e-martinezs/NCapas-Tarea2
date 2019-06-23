package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.dto.EmpleadoDTO;
import com.uca.capas.repositories.EmpleadoRepository;
import com.uca.capas.repositories.SucursalRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Autowired
	private SucursalRepository sucursalRepository;

	@Override
	public List<Empleado> findAll() {
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado findById(int id) {
		return empleadoRepository.getOne(id);
	}

	@Override
	public Empleado save(EmpleadoDTO dto) {
		Sucursal s = sucursalRepository.getOne(dto.getSucursalId());
		Empleado e = new Empleado();
		e.setId(dto.getId());
		e.setNombre(dto.getNombre());
		e.setEdad(dto.getEdad());
		e.setGenero(dto.getGenero());
		e.setEstado(dto.getEstado());
		e.setSucursal(s);
		return empleadoRepository.save(e);
	}

	@Override
	public void delete(Empleado e) {
		empleadoRepository.delete(e);
	}

}
