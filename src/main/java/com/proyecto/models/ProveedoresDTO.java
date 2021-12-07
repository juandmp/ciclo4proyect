package com.proyecto.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="proveedores")
public class ProveedoresDTO {
	@Id
	private String _id;
	private long nit_proveedor;
	private String nombre_proveedor;
	private long telefono_proovedor;
	private String email_proveedor;
	private String direccion_proveedor;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public long getNit_proveedor() {
		return nit_proveedor;
	}
	public void setNit_proveedor(long nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}
	public String getNombre_proveedor() {
		return nombre_proveedor;
	}
	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}
	public long getTelefono_proovedor() {
		return telefono_proovedor;
	}
	public void setTelefono_proovedor(long telefono_proovedor) {
		this.telefono_proovedor = telefono_proovedor;
	}
	public String getEmail_proveedor() {
		return email_proveedor;
	}
	public void setEmail_proveedor(String email_proveedor) {
		this.email_proveedor = email_proveedor;
	}
	public String getDireccion_proveedor() {
		return direccion_proveedor;
	}
	public void setDireccion_proveedor(String direccion_proveedor) {
		this.direccion_proveedor = direccion_proveedor;
	}
	
	

}
