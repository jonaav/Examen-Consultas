package com.example.examen.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "DetallesConsulta")
public class DetalleConsulta implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetalle;
	
	@NotEmpty(message = "El diagnóstico no puede ser vacio")
	private String diagnostico;
	
	@NotEmpty(message = "El tratamiento no puede ser vacio")
	private String tratamiento;
	
	@ManyToOne
	@JoinColumn(name = "id_consulta", nullable = false, foreignKey = 
	@ForeignKey ( name = "FK_consulta_detalle"))
	private Consulta consulta;

	public DetalleConsulta(Long idDetalle, String diagnostico, String tratamiento, Consulta consulta) {
		this.idDetalle = idDetalle;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
		this.consulta = consulta;
	}

	public Long getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Long idDetalle) {
		this.idDetalle = idDetalle;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	
	
	
	
	
}
