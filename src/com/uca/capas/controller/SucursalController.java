package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.service.SucursalService;

@Controller
public class SucursalController {
	
	@Autowired
	private SucursalService sucursalService;
	
	@RequestMapping("/verSucursales")
	public ModelAndView verSucursales() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("sucursales",sucursalService.findAll());
		mav.setViewName("verSucursales");
		return mav;
	}

	@RequestMapping("/formSucursalAgregar")
	public ModelAndView formSucursalAgregar() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("sucursal", new Sucursal());
		mav.addObject("label", "Agregar");
		mav.setViewName("formSucursal");
		return mav;
	}
	
	@RequestMapping("/formSucursalEditar")
	public ModelAndView formSucursalEditar(Integer id) {
		ModelAndView mav = new ModelAndView();
		Sucursal s = sucursalService.findById(id);
		mav.addObject("sucursal", s);
		mav.addObject("label", "Editar");
		mav.setViewName("formSucursal");
		return mav;
	}
	
	@RequestMapping("/eliminarSucursal")
	public ModelAndView eliminarSucursal(Integer id) {
		ModelAndView mav = new ModelAndView();
		Sucursal s = sucursalService.findById(id);
		sucursalService.delete(s);
		mav.addObject("sucursales",sucursalService.findAll());
		mav.setViewName("verSucursales");
		return mav;
	}
	
	@RequestMapping("/agregarSucursal")
	public ModelAndView updateSucursal(@ModelAttribute Sucursal s) {
		ModelAndView mav = new ModelAndView();
		sucursalService.save(s);
		mav.addObject("sucursales",sucursalService.findAll());
		mav.setViewName("verSucursales");
		return mav;
	}
	
	@RequestMapping("/perfilSucursal")
	public ModelAndView perfilSucursal(Integer id) {
		ModelAndView mav = new ModelAndView();
		Sucursal s = sucursalService.findById(id);
		mav.addObject("sucursal", s);
		mav.addObject("empleados", s.getEmpleados());
		mav.setViewName("perfilSucursal");
		return mav;
	}
}
