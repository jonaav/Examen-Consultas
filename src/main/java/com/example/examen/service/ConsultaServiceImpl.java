package com.example.examen.service;

import java.util.Date;
import java.util.List;

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

	@Override
	public List<Consulta> findByIdMedico(Long idMedico) {
		List<Consulta> consultas = consultaRepository.findByIdMedico(idMedico);
		return consultas;
	}

	@Override
	public List<Consulta> findByFechaAndIdPaciente(Date fecha, Long idPaciente) {
		// TODO Auto-generated method stub
		return null;
	}

}
