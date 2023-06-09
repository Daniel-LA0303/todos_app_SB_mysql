package com.bolsadeideas.springboot.rest_api_mysql.app.controlador;

import javax.management.modelmbean.ModelMBeanOperationInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.bolsadeideas.springboot.rest_api_mysql.app.entidad.Estudiante;
import com.bolsadeideas.springboot.rest_api_mysql.app.repositorio.EstudianteRepositorio;
import com.bolsadeideas.springboot.rest_api_mysql.app.servicio.EstudianteServicio;

@Controller
public class EstudianteControlador {
	
	@Autowired
	private EstudianteServicio servicio;
	//metodos crud
	@GetMapping({"/estudiantes", "/"})
	public String listarEstudiantes(Model model) {
		model.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
		return "estudiantes"; //retorna el archivo estudiantes.html
	}
	
	//muestra la vista
	@GetMapping("/estudiantes/nuevo")
	public String mostrarEstudianteFormulario(Model model) {
		Estudiante estudiante = new Estudiante();
		model.addAttribute("estudiante", estudiante);
		
		return "crear_estudiante";
	}
	
	@PostMapping("/estudiantes")
	public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
		servicio.guardarEstudiante(estudiante);
		
		return "redirect:/estudiantes";
	}
	
	//muestra la vista
	@GetMapping("/estudiantes/editar/{id}")
	public String mostrarFormEdit(@PathVariable Long id, Model model) {
		model.addAttribute("estudiante", servicio.obtenerEstudiantebyId(id));
		
		return "editar_estudiante";
	}
	
	
	@PostMapping("/estudiantes/{id}")
	public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante, Model model) {
		Estudiante estudianteExiste = servicio.obtenerEstudiantebyId(id);
		estudianteExiste.setId(id);
		estudianteExiste.setNombre(estudiante.getNombre());
		estudianteExiste.setApellido(estudiante.getApellido());
		estudianteExiste.setEmail(estudiante.getEmail());
		servicio.actualizarEstudiante(estudianteExiste);
		return "redirect:/estudiantes";
	}
	
	
	//mostrando la vista
	@GetMapping("/estudiantes/{id}")
	public String eliminarEstudiante(@PathVariable Long id) {
		servicio.eliminarEstudiante(id);
		return "redirect:/estudiantes";
	}
	
	
	
	
	
}
