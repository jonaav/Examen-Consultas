package com.example.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entity.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente, Long>{

}
