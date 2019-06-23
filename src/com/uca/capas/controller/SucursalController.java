package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		mav.setViewName("formSucursal");
		return mav;
	}
	
	@RequestMapping("/formSucursalEditar")
	public ModelAndView formSucursalEditar(@RequestParam Integer id) {
		ModelAndView mav = new ModelAndView();
		Sucursal s = sucursalService.findById(id);
		mav.addObject("sucursal", s);
		mav.setViewName("formSucursal");
		return mav;
	}
	
	@RequestMapping("/eliminarSucursal")
	public ModelAndView eliminarSucursal(@RequestParam Integer id) {
		ModelAndView mav = new ModelAndView();
		Sucursal s = sucursalService.findById(id);
		sucursalService.delete(s);
		mav.addObject("sucursales",sucursalService.findAll());
		mav.setViewName("verSucursales");
		return mav;
	}
	
	@RequestMapping("/updateSucursal")
	public ModelAndView updateSucursal(@Valid @ModelAttribute Sucursal s, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if (result.hasErrors()) {
			mav.addObject("sucursal", s);
			mav.setViewName("formSucursal");
		}else {
			sucursalService.save(s);
			mav.addObject("sucursales",sucursalService.findAll());
			mav.setViewName("verSucursales");
		}
		return mav;
	}
	
	@RequestMapping("/perfilSucursal")
	public ModelAndView perfilSucursal(@RequestParam Integer id) {
		ModelAndView mav = new ModelAndView();
		Sucursal s = sucursalService.findById(id);
		mav.addObject("sucursal", s);
		mav.addObject("empleados", s.getEmpleados());
		mav.setViewName("perfilSucursal");
		return mav;
	}
}
