package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Especialidad;

public interface IEspecialidadService {
	
	
	public List<Especialidad> findAll();
	public Especialidad findById(Long idEspecialidad);
	public Especialidad create(Especialidad especialidad);
	public Especialidad update(Especialidad especialidad);
	public Especialidad delete(Long idEspecialidad);
}
