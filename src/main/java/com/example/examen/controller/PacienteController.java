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

import com.example.examen.entity.Paciente;
import com.example.examen.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	IPacienteService pacienteService;
	
	@GetMapping
	public ResponseEntity<List<Paciente>> listAllPacientes(){
		List<Paciente> pacientes = new ArrayList<>();
		pacientes = pacienteService.findAll();
		return ResponseEntity.ok(pacientes);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Paciente> getPaciente(@PathVariable("id") long id){
		Paciente paciente = pacienteService.findById(id);
		return ResponseEntity.ok(paciente);
	}
	
	@PostMapping
	public ResponseEntity<Paciente> create(@Valid @RequestBody Paciente paciente) throws Exception{
		Paciente pacienteDB = pacienteService.create(paciente);
		return ResponseEntity.status(HttpStatus.CREATED).body(pacienteDB);
	}
	
	@PutMapping
	public ResponseEntity<Paciente> update(@PathVariable("id") long id, @RequestBody Paciente paciente){
		
		Paciente currentPaciente = pacienteService.findById(id);
		
		paciente.setIdPaciente(id);
		currentPaciente = pacienteService.update(paciente);
		return ResponseEntity.ok(currentPaciente);
	}
	
	
	
	
	
	
}
