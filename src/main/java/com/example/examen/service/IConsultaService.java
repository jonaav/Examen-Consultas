package com.example.examen.service;

import java.util.Date;
import java.util.List;

import com.example.examen.entity.Consulta;

public interface IConsultaService {
	
	public Consulta findById(Long idConsulta);
	public Consulta create (Consulta consulta);

	public List<Consulta> findByIdMedico(Long idMedico);
	
	public List<Consulta> findByFechaAndIdPaciente(Date fecha, Long idPaciente);
}
