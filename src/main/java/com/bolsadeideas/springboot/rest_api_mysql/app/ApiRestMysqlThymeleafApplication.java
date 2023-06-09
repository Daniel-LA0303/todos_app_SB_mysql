package com.bolsadeideas.springboot.rest_api_mysql.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bolsadeideas.springboot.rest_api_mysql.app.entidad.Estudiante;
import com.bolsadeideas.springboot.rest_api_mysql.app.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class ApiRestMysqlThymeleafApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ApiRestMysqlThymeleafApplication.class, args);
	}

	//repositorio
	@Autowired
	private EstudianteRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		Estudiante estudiante1 = new Estudiante("Daniel", "Zac", "correo@correo");
		repositorio.save(estudiante1);
		
		Estudiante estudiante2 = new Estudiante("Daniel2", "Zac2", "correo2@correo");
		repositorio.save(estudiante2);
		*/
	}

}
