package com.rodrigo.localiza.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="localiza_modelo_dispositivo")
public class Modelo_Dispositivo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="autoIncrement" , strategy="increment")
	@GeneratedValue(generator="autoIncrement")
	@Column(name="id_modelo")
	private int id;
	@Column(length=100)
	private String modelo;
	@JoinColumn(name="fk_id_marca", referencedColumnName="id_marca")
	@ManyToOne
	private Marca_Dispositivo marca;
	public Modelo_Dispositivo() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Marca_Dispositivo getMarca() {
		return marca;
	}
	public void setMarca(Marca_Dispositivo marca) {
		this.marca = marca;
	}
	
}	