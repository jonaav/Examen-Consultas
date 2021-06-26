package com.example.examen.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entity.Consulta;
import com.example.examen.service.IConsultaService;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

	@Autowired
	IConsultaService consultaService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Consulta> getConsulta(@PathVariable("id") long id) {
		Consulta consulta = consultaService.findById(id);
		return ResponseEntity.ok(consulta);
	}
	
	@PostMapping
	public ResponseEntity<Consulta> create (@Valid @RequestBody Consulta consulta) throws Exception{
		Consulta consultaDB = consultaService.create(consulta);
		return ResponseEntity.status(HttpStatus.CREATED).body(consultaDB);
	}
	
	
	
	
	
	
	
	
}
