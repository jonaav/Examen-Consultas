package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Medico;

public interface IMedicoService {

	public List<Medico> findAll();
	public Medico findById(Long idMedico);
	public Medico create(Medico medico);
	public Medico update(Medico medico);
	public Medico delete(Long idMedico);
}
