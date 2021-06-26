package com.example.examen.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Especialidades")
public class Especialidad implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEspecialidad;
	
	@NotEmpty(message = "El nombre no puede ser vacio")
	private String nombre;

	public Especialidad(Long idEspecialidad, @NotEmpty(message = "El nombre no puede ser vacio") String nombre) {
		this.idEspecialidad = idEspecialidad;
		this.nombre = nombre;
	}

	public Long getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(Long idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	
	
	
	
}
