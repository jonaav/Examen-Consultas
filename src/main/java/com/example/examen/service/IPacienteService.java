package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Paciente;

public interface IPacienteService {

	public List<Paciente> findAll();
	public Paciente findById(Long idPaciente);
	public Paciente create(Paciente paciente);
	public Paciente update(Paciente paciente);
	public Paciente delete(Long idPaciente);
}
