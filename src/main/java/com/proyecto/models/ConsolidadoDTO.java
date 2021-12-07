package com.proyecto.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="consolidado")
public class ConsolidadoDTO {
	@Id
	private String _id;
	private String ciudad;
	private long total_ventas;
	
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public long getTotal_ventas() {
		return total_ventas;
	}
	public void setTotal_ventas(long total_ventas) {
		this.total_ventas = total_ventas;
	}
	

}
