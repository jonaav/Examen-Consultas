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

import com.example.examen.entity.Medico;
import com.example.examen.service.IMedicoService;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

	@Autowired
	IMedicoService medicoService;
	
	@GetMapping
	public ResponseEntity<List<Medico>> listAllMedicos(){
		List<Medico> medicos = new ArrayList<>();
		medicos = medicoService.findAll();
		return ResponseEntity.ok(medicos);
	}
	
	@GetMapping("/id")
	public ResponseEntity<Medico> getMedico(@PathVariable("id") long id){
		Medico medico = medicoService.findById(id);
		return ResponseEntity.ok(medico);
	}
	
	@PostMapping
	public ResponseEntity<Medico> create(@Valid @RequestBody Medico medico) throws Exception{
		Medico medicoDB = medicoService.create(medico);
		return ResponseEntity.status(HttpStatus.CREATED).body(medicoDB);
	}
	
	@PutMapping
	public ResponseEntity<Medico> update (@PathVariable("id") long id, @RequestBody Medico medico){
		
		Medico currentMedico = medicoService.findById(id); 
		medico.setIdMedico(id);
		currentMedico = medicoService.update(medico);
		return ResponseEntity.ok(currentMedico);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
