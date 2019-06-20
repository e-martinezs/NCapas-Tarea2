package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping("/agregarSucursal")
	public ModelAndView agregarSucursal() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/eliminarSucursal")
	public ModelAndView eliminarSucursal() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/editarSucursal")
	public ModelAndView editarSucursal() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/perfilSucursal")
	public ModelAndView perfilSucursal() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
}
