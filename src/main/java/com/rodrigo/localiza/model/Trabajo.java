package com.rodrigo.localiza.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="Trabajo")
public class Trabajo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="boleta")
	private int boleta;
	
	private int imei;
	
	@Column(length=10)
	private String sim;
	
	private Timestamp fecha;
	
	private boolean estado;
	
	@Column(length=300)
	private String unidad;
	
	@Column(length=300)
	private String comentario;
	
	@JoinColumn(name="fk_tipo_trabajo", referencedColumnName="id_tipo_trabajo")
	@ManyToOne
	private Tipo_Trabajo tipoTrabajo;
	
	@JoinColumn(name="fk_tecnico", referencedColumnName="id_tecnico")
	@ManyToOne
	private Tecnicos tecnico;
	
	@JoinColumn(name="fk_ejecutiva", referencedColumnName="id_ejecutiva")
	@ManyToOne
	private Ejecutivas ejecutiva;
	
	@JoinColumn(name="fk_monitoreo", referencedColumnName="id_monitoreo")
	@ManyToOne
	private Monitoreo monitoreo;
	
	@JoinColumn(name="fk_dispositivo", referencedColumnName="id_marca")
	@ManyToOne
	private Marca_Dispositivo marcaDispositivo;
	
	@JoinColumn(name="fk_modelo", referencedColumnName="id_modelo")
	@ManyToOne
	private Modelo_Dispositivo modeloDispositivo;
	
	@JoinColumn(name="fk_cliente", referencedColumnName="cliente_id")
	@ManyToOne
	private Cliente cliente;
	
	@JoinColumn(name="fk_ubicacion", referencedColumnName="id_ubicacion")
	@ManyToOne
	private ubicacion_gps ubicacionGps;
	
	public Trabajo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBoleta() {
		return boleta;
	}

	public void setBoleta(int boleta) {
		this.boleta = boleta;
	}

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Tipo_Trabajo getTipoTrabajo() {
		return tipoTrabajo;
	}

	public void setTipoTrabajo(Tipo_Trabajo tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
	}

	public Tecnicos getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnicos tecnico) {
		this.tecnico = tecnico;
	}

	public Ejecutivas getEjecutiva() {
		return ejecutiva;
	}

	public void setEjecutiva(Ejecutivas ejecutiva) {
		this.ejecutiva = ejecutiva;
	}

	public Monitoreo getMonitoreo() {
		return monitoreo;
	}

	public void setMonitoreo(Monitoreo monitoreo) {
		this.monitoreo = monitoreo;
	}

	public Marca_Dispositivo getMarcaDispositivo() {
		return marcaDispositivo;
	}

	public void setMarcaDispositivo(Marca_Dispositivo marcaDispositivo) {
		this.marcaDispositivo = marcaDispositivo;
	}

	public Modelo_Dispositivo getModeloDispositivo() {
		return modeloDispositivo;
	}

	public void setModeloDispositivo(Modelo_Dispositivo modeloDispositivo) {
		this.modeloDispositivo = modeloDispositivo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ubicacion_gps getUbicacionGps() {
		return ubicacionGps;
	}

	public void setUbicacionGps(ubicacion_gps ubicacionGps) {
		this.ubicacionGps = ubicacionGps;
	}
	
	
}
