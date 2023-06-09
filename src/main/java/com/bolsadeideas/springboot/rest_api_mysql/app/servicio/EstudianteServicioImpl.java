package com.bolsadeideas.springboot.rest_api_mysql.app.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.rest_api_mysql.app.entidad.Estudiante;
import com.bolsadeideas.springboot.rest_api_mysql.app.repositorio.EstudianteRepositorio;

@Service
public class EstudianteServicioImpl implements EstudianteServicio{

	@Autowired
	private EstudianteRepositorio repositorio;
	
	//metodos?
	@Override
	public List<Estudiante> listarTodosLosEstudiantes() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return repositorio.save(estudiante);
	}

	@Override
	public Estudiante obtenerEstudiantebyId(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).get();
	}

	@Override
	public Estudiante actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return repositorio.save(estudiante);
	}

	@Override
	public void eliminarEstudiante(Long id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
		
	}
	
}
