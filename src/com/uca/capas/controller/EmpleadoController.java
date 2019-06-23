package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.dto.EmpleadoDTO;
import com.uca.capas.service.EmpleadoService;
import com.uca.capas.service.SucursalService;

@Controller
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private SucursalService sucursalService;
	
	@RequestMapping("/formEmpleadoAgregar")
	public ModelAndView formEmpleadoAgregar(@RequestParam Integer sucursalId) {
		ModelAndView mav = new ModelAndView();
		EmpleadoDTO dto = new EmpleadoDTO();
		dto.setSucursalId(sucursalId);
		mav.addObject("empleado", dto);
		mav.setViewName("formEmpleado");
		return mav;
	}
	
	@RequestMapping("/formEmpleadoEditar")
	public ModelAndView formEmpleadoEditar(@RequestParam Integer id) {
		ModelAndView mav = new ModelAndView();
		Empleado e = empleadoService.findById(id);
		EmpleadoDTO dto = new EmpleadoDTO();
		dto.setId(e.getId());
		dto.setNombre(e.getNombre());
		dto.setEdad(e.getEdad());
		dto.setGenero(e.getGenero());
		dto.setEstado(e.getEstado());
		dto.setSucursalId(e.getSucursal().getId());
		mav.addObject("empleado", dto);
		mav.setViewName("formEmpleado");
		return mav;
	}
	
	@RequestMapping("/updateEmpleado")
	public ModelAndView updateEmpleado(@Valid @ModelAttribute EmpleadoDTO e, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if (result.hasErrors()) {
			mav.addObject("empleado",e);
			mav.setViewName("formEmpleado");
		}else {
			empleadoService.save(e);
			Sucursal s = sucursalService.findById(e.getSucursalId());
			mav.addObject("sucursal", s);
			mav.addObject("empleados", s.getEmpleados());
			mav.setViewName("perfilSucursal");
		}
		return mav;
	}
	
	@RequestMapping("/eliminarEmpleado")
	public ModelAndView main(@RequestParam Integer id, @RequestParam Integer sucursalId) {
		ModelAndView mav = new ModelAndView();
		Empleado e = empleadoService.findById(id);
		empleadoService.delete(e);
		Sucursal s = sucursalService.findById(sucursalId);
		mav.addObject("sucursal",s);
		mav.addObject("empleados",s.getEmpleados());
		mav.setViewName("perfilSucursal");
		return mav;
	}
}
