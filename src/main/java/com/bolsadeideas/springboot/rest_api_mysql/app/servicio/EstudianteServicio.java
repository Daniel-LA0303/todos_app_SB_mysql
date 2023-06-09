package com.bolsadeideas.springboot.rest_api_mysql.app.servicio;

import java.util.List;

import com.bolsadeideas.springboot.rest_api_mysql.app.entidad.Estudiante;

public interface EstudianteServicio {
	
	public List<Estudiante> listarTodosLosEstudiantes();
	
	public Estudiante guardarEstudiante(Estudiante estudiante);
	
	public Estudiante obtenerEstudiantebyId(Long id);
	
	public Estudiante actualizarEstudiante(Estudiante estudiante);
	
	public void eliminarEstudiante(Long id);
}
