package com.example.examen.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Pacientes")
public class Paciente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaciente;
	
	@NotEmpty(message = "Los nombres no pueden ser vacio")
	private String nombres;
	
	@NotEmpty(message = "Los apellidos no pueden ser vacio")
	private String apellidos;
	
	@NotEmpty(message = "El cmp no puede ser vacio")
	private String dni;
	
	@NotEmpty(message = "Los direccion no pueden ser vacio")
	private String direccion;
	
	@NotEmpty(message = "Los telefono no pueden ser vacio")
	private String telefono;
	
	@NotEmpty(message = "El email no puede ser vacio")
	private String email;

	public Paciente(Long idPaciente, @NotEmpty(message = "Los nombres no pueden ser vacio") String nombres,
			@NotEmpty(message = "Los apellidos no pueden ser vacio") String apellidos,
			@NotEmpty(message = "El cmp no puede ser vacio") String dni,
			@NotEmpty(message = "Los direccion no pueden ser vacio") String direccion,
			@NotEmpty(message = "Los telefono no pueden ser vacio") String telefono,
			@NotEmpty(message = "El email no puede ser vacio") String email) {
		this.idPaciente = idPaciente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
