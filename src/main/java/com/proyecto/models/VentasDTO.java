package com.proyecto.models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="ventas")
public class VentasDTO {
	@Id
	private String _id;
	public long cedula_cliente;
	public long codigo_venta;
	private ArrayList<DetalleVentaDTO> detalles;
	public long ivaventa;
	public long total_venta;
	public long valor_venta;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public long getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(long cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public long getCodigo_venta() {
		return codigo_venta;
	}
	public void setCodigo_venta(long codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	public ArrayList<DetalleVentaDTO> getDetalles() {
		return detalles;
	}
	public void setDetalles(ArrayList<DetalleVentaDTO> detalles) {
		this.detalles = detalles;
	}
	public long getIvaventa() {
		return ivaventa;
	}
	public void setIvaventa(long ivaventa) {
		this.ivaventa = ivaventa;
	}
	public long getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(long total_venta) {
		this.total_venta = total_venta;
	}
	public long getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(long valor_venta) {
		this.valor_venta = valor_venta;
	}
	

}
