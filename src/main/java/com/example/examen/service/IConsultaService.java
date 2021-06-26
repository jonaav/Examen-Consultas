package com.example.examen.service;

import com.example.examen.entity.Consulta;

public interface IConsultaService {
	
	public Consulta findById(Long idConsulta);
	public Consulta create (Consulta consulta);
}
