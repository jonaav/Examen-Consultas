package com.example.examen.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Consultas")
public class Consulta implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConsulta;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name = "id_medico", nullable = false, foreignKey = 
	@ForeignKey ( name = "FK_consulta_medico"))
	private Medico medico;
	@ManyToOne
	@JoinColumn(name = "id_paciente", nullable = false, foreignKey = 
	@ForeignKey ( name = "FK_consulta_paciente"))
	private Paciente paciente;
	@ManyToOne
	@JoinColumn(name = "id_especialidad", nullable = false, foreignKey = 
	@ForeignKey ( name = "FK_consulta_especialidad"))
	private Especialidad especialidad;
	
	@OneToMany(mappedBy = "consulta", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<DetalleConsulta> detalleConsulta;


	
	
	public Consulta(Long idConsulta, Date fecha, Medico medico, Paciente paciente, Especialidad especialidad,
			List<DetalleConsulta> detalleConsulta) {
		this.idConsulta = idConsulta;
		this.fecha = fecha;
		this.medico = medico;
		this.setPaciente(paciente);
		this.setEspecialidad(especialidad);
		this.detalleConsulta = detalleConsulta;
	}

	public Consulta() {}

	public Long getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(Long idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	
}
