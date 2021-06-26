package com.example.examen.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.examen.entity.Consulta;

public interface IConsultaRepository extends JpaRepository<Consulta, Long>{

	@Query(value = "SELECT * FROM consultas c INNER JOIN medicos m WHERE c.id_medico = :idMedico", 
			nativeQuery = true)
	public List<Consulta> findByIdMedico(@Param("idMedico")Long idMedico);
	
	public List<Consulta> findByFechaAndIdPaciente(Date fecha, Long idPaciente);
}
