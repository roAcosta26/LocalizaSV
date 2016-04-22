package com.rodrigo.localiza.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Tipo_Trabajo")
public class Tipo_Trabajo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tipo_trabajo")
	private int id_tipo_trabajo;
	
	@Column(length=40)
	private String tipo_trabajo;
	
	@Column(length=300)
	private String descripcion;
	
	public Tipo_Trabajo() {
		super();
	}

	public int getId_tipo_trabajo() {
		return id_tipo_trabajo;
	}

	public void setId_tipo_trabajo(int id_tipo_trabajo) {
		this.id_tipo_trabajo = id_tipo_trabajo;
	}

	public String getTipo_trabajo() {
		return tipo_trabajo;
	}

	public void setTipo_trabajo(String tipo_trabajo) {
		this.tipo_trabajo = tipo_trabajo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}

	
	
	
	