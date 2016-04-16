package com.rodrigo.localiza.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tipo_cliente")

public class tipo_cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="autoincrement",strategy="increment")
	@GeneratedValue(generator="autoIncrement")
	@Column(name="tipo_cliente_id")
	private int tipo_cliente_id;
	
	@Column(name="tipo_cliente_categoria", length = 25)
	private String tipo_cliente_categoria;
	
	@Column (name="tipo_cliente_descripcion", length = 300)
	private String tipo_cliente_descripcion;

	public tipo_cliente() {
		super();
	}

	public int getTipo_cliente_id() {
		return tipo_cliente_id;
	}

	public void setTipo_cliente_id(int tipo_cliente_id) {
		this.tipo_cliente_id = tipo_cliente_id;
	}

	public String getTipo_cliente_categoria() {
		return tipo_cliente_categoria;
	}

	public void setTipo_cliente_categoria(String tipo_cliente_categoria) {
		this.tipo_cliente_categoria = tipo_cliente_categoria;
	}

	public String getTipo_cliente_descripcion() {
		return tipo_cliente_descripcion;
	}

	public void setTipo_cliente_descripcion(String tipo_cliente_descripcion) {
		this.tipo_cliente_descripcion = tipo_cliente_descripcion;
	}
	
}
