package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
		mav.addObject("label", "Agregar");
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
		mav.addObject("label", "Editar");
		mav.setViewName("formEmpleado");
		return mav;
	}
	
	@RequestMapping("/agregarEmpleado")
	public ModelAndView agregarEmpleado(@ModelAttribute EmpleadoDTO e) {
		ModelAndView mav = new ModelAndView();
		empleadoService.save(e);
		Sucursal s = sucursalService.findById(e.getSucursalId());
		mav.addObject("sucursal", s);
		mav.addObject("empleados", s.getEmpleados());
		mav.setViewName("perfilSucursal");
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
