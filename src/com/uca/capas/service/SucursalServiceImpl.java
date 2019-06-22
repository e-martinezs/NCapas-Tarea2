package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.repositories.SucursalRepository;

@Service
public class SucursalServiceImpl implements SucursalService{
	
	@Autowired
	private SucursalRepository sucursalRepository;
	
	@Override
	public List<Sucursal> findAll() {
		return sucursalRepository.findAll();
	}
	
	@Override
	public Sucursal findById(int id) {
		return sucursalRepository.getOne(id);
	}

	@Override
	public Sucursal save(Sucursal s) {
		return sucursalRepository.save(s);
	}

	@Override
	public void delete(Sucursal s) {
		sucursalRepository.delete(s);
	}
}
