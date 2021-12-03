package com.proyecto.models;

public class DetalleVentaDTO {
	private long codigo_producto;
	private long cantidad_producto;
	private long valor_total;
	private long valor_venta;
	private long valoriva;
	public long getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public long getCantidad_producto() {
		return cantidad_producto;
	}
	public void setCantidad_producto(long cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}
	public long getValor_total() {
		return valor_total;
	}
	public void setValor_total(long valor_total) {
		this.valor_total = valor_total;
	}
	public long getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(long valor_venta) {
		this.valor_venta = valor_venta;
	}
	public long getValoriva() {
		return valoriva;
	}
	public void setValoriva(long valoriva) {
		this.valoriva = valoriva;
	}
	
	
	
}
