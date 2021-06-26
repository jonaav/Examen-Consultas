package com.example.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Consulta;
import com.example.examen.repository.IConsultaRepository;

@Service
public class ConsultaServiceImpl implements IConsultaService{

	
	@Autowired
	IConsultaRepository consultaRepository;
	
	@Override
	public Consulta findById(Long idConsulta) {
		Consulta consulta = consultaRepository.findById(idConsulta).orElse(null);
		return consulta;
	}

	@Override
	public Consulta create(Consulta consulta) {
		Consulta nuevaConsulta = consultaRepository.save(consulta);
		return nuevaConsulta;
	}

}
