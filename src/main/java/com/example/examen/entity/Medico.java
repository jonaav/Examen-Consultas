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
@Table(name = "Medicos")
public class Medico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMedico;

	@NotEmpty(message = "Los nombres no pueden ser vacio")
	private String nombres;
	
	@NotEmpty(message = "Los apellidos no pueden ser vacio")
	private String apellidos;
	
	@NotEmpty(message = "El cmp no puede ser vacio")
	private String cmp;

	public Medico(Long idMedico, @NotEmpty(message = "Los nombres no pueden ser vacio") String nombres,
			@NotEmpty(message = "Los apellidos no pueden ser vacio") String apellidos,
			@NotEmpty(message = "El cmp no puede ser vacio") String cmp) {
		this.idMedico = idMedico;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cmp = cmp;
	}
	
	public Medico() {
		
	}

	public Long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCmp() {
		return cmp;
	}

	public void setCmp(String cmp) {
		this.cmp = cmp;
	}

	


}
