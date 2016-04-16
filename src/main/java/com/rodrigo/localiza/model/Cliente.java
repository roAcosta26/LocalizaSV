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
@Table(name="cliente")
public class Cliente implements Serializable{
	
	private static final long serialVersionIUD = 1L;
	@Id
	@GenericGenerator(name="autoIncrement", strategy="increment")
	@GeneratedValue(generator="autoIncrement")
	@Column(name="cliente_id")
	private int id;
	
	@Column(length=300)
	private String cliente_nombre;
	
	@ManyToOne
	@JoinColumn(name="fk_tipo_cliente", referencedColumnName="tipo_cliente_id")
	private tipo_cliente tipo_cliente;
	
	public Cliente(){
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente_nombre() {
		return cliente_nombre;
	}

	public void setCliente_nombre(String cliente_nombre) {
		this.cliente_nombre = cliente_nombre;
	}

	public tipo_cliente getTipo_cliente() {
		return tipo_cliente;
	}

	public void setTipo_cliente(tipo_cliente tipo_cliente) {
		this.tipo_cliente = tipo_cliente;
	}
	
	
	
	
	
	
}
