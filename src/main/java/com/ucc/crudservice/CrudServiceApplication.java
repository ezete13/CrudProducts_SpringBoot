package com.ucc.crudservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@SpringBootApplication
@RestController
public class CrudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudServiceApplication.class, args);
	}
	/*
	//Prueba Conexión
	@GetMapping(path = "/")
	public List<String> getNames(){
		return List.of(
				"Ezequiel",
				"Alexis"
		);
	}
	*/
}
