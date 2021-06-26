package com.example.examen.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entity.Especialidad;
import com.example.examen.service.IEspecialidadService;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {

	@Autowired
	IEspecialidadService especialidadService;
	
	@GetMapping
	public List<Especialidad> listAllEspecialidades(){
		List<Especialidad> especialidades = new ArrayList<>();
		especialidades = especialidadService.findAll();
		return especialidades;
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Especialidad> getEspecialidad(@PathVariable("id") long id){
		Especialidad especialidad = especialidadService.findById(id);
		return ResponseEntity.ok(especialidad);
	}
	
	@PostMapping
	public ResponseEntity<Especialidad> create (@Valid @RequestBody Especialidad especialidad) throws Exception{
		Especialidad especialidadDB = especialidadService.create(especialidad);
		return ResponseEntity.status(HttpStatus.CREATED).body(especialidadDB);
	}
	
	
	@PutMapping
	public ResponseEntity<Especialidad> update (@PathVariable("id") long id, @RequestBody Especialidad especialidad){
		Especialidad currentEspecialidad = especialidadService.findById(id);
		especialidad.setIdEspecialidad(id);
		currentEspecialidad = especialidadService.update(especialidad);
		return ResponseEntity.ok(currentEspecialidad);
	}
	
	
	
	
	
	
}
