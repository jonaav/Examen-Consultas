package com.example.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Medico;
import com.example.examen.repository.IMedicoRepository;

@Service
public class MedicoServiceImpl implements IMedicoService{

	@Autowired
	IMedicoRepository medicoRepository;
	
	@Override
	public List<Medico> findAll() {
		List<Medico> medicos = medicoRepository.findAll();
		return medicos;
	}

	@Override
	public Medico findById(Long idMedico) {
		Medico medico = medicoRepository.findById(idMedico).orElse(null);
		return medico;
	}

	@Override
	public Medico create(Medico medico) {
		Medico nuevoMedico = medicoRepository.save(medico);
		return nuevoMedico;
	}

	@Override
	public Medico update(Medico medico) {
		Medico medicoDB = medicoRepository.getById(medico.getIdMedico());
		
		if(medicoDB == null) return null;
		
		medicoDB.setNombres(medico.getNombres());
		medicoDB.setApellidos(medico.getApellidos());
		medicoDB.setCmp(medico.getCmp());
		
		return medicoRepository.save(medicoDB);
	}

	@Override
	public Medico delete(Long idMedico) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
