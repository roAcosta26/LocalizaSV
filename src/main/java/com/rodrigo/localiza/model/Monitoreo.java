package com.rodrigo.localiza.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Monitoreo")
public class Monitoreo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_monitoreo")
	private int id;
	
	@Column(length=70)
	private String nombre;
	
	@Column(length=70)
	private String apellido;
	
	@JoinColumn(name="fk_usuario", referencedColumnName="id_usuario")
	@OneToOne
	private Usuario usuario;
	
	public Monitoreo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Usuario getUser() {
		return usuario;
	}
	public void setUser(Usuario user) {
		this.usuario = usuario;
	}
	
}