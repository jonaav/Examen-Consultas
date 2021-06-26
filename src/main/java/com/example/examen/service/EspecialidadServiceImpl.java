package com.example.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Especialidad;
import com.example.examen.repository.IEspecialidadRepository;

@Service
public class EspecialidadServiceImpl implements IEspecialidadService{

	@Autowired
	IEspecialidadRepository especialidadRepository;
	
	@Override
	public List<Especialidad> findAll() {
		List<Especialidad> especialidades = especialidadRepository.findAll();
		return especialidades;
	}

	@Override
	public Especialidad findById(Long idEspecialidad) {
		Especialidad especialidad = especialidadRepository.findById(idEspecialidad).orElse(null);
		return especialidad;
	}

	@Override
	public Especialidad create(Especialidad especialidad) {
		Especialidad nuevaEspecialidad = especialidadRepository.save(especialidad);
		return nuevaEspecialidad;
	}

	@Override
	public Especialidad update(Especialidad especialidad) {
		Especialidad especialidadDB = especialidadRepository.getById(especialidad.getIdEspecialidad());
		if(especialidadDB == null) return null;
		especialidadDB.setNombre(especialidad.getNombre());
		return especialidadRepository.save(especialidadDB);
	}

	@Override
	public Especialidad delete(Long idEspecialidad) {
		// TODO Auto-generated method stub
		return null;
	}

}
