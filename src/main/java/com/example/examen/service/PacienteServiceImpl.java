package com.example.examen.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Paciente;
import com.example.examen.repository.IPacienteRepository;


@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	IPacienteRepository pacienteRepository;
	
	@Override
	public List<Paciente> findAll() {
		List<Paciente> pacientes = new ArrayList<>();
		pacientes = pacienteRepository.findAll();
		return pacientes;
	}

	@Override
	public Paciente findById(Long idPaciente) {
		Paciente paciente = pacienteRepository.findById(idPaciente).orElse(null);
		return paciente;
	}

	@Override
	public Paciente create(Paciente paciente) {
		Paciente nuevoPaciente = pacienteRepository.save(paciente);
		return nuevoPaciente;
	}

	@Override
	public Paciente update(Paciente paciente) {
		Paciente pacienteDB = pacienteRepository.getById(paciente.getIdPaciente());
		if(pacienteDB == null) {
			return null;
		}
		pacienteDB.setNombres(paciente.getNombres());
		pacienteDB.setApellidos(paciente.getApellidos());
		pacienteDB.setDni(paciente.getDni());
		pacienteDB.setDireccion(paciente.getDireccion());
		pacienteDB.setTelefono(paciente.getTelefono());
		pacienteDB.setEmail(paciente.getEmail());
		return pacienteRepository.save(pacienteDB);
	}

	@Override
	public Paciente delete(Long idPaciente) {
		// TODO Auto-generated method stub
		return null;
	}


}
