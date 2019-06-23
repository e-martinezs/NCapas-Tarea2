package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Usuario;
import com.uca.capas.service.SucursalService;
import com.uca.capas.service.UsuarioService;

@Controller
public class MainController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("usuario", new Usuario());
		mav.setViewName("login");
		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@ModelAttribute Usuario u) {
		ModelAndView mav = new ModelAndView();
		Usuario u2 = usuarioService.findByUsername(u.getUsername());
		if (u2 != null && u2.getPassword().equals(u.getPassword())) {
			return new ModelAndView("redirect:/verSucursales");
		}else {
			mav.addObject("usuario", u);
			mav.setViewName("login");
		}
		return mav;
	}
}
