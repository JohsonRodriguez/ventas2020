package com.idat.javawebavanzado.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Article {

	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 
	 @Column(name="nombre_producto")
	 private String nombre_producto;
	 
	 @Column(name="precio_producto")
	 private double precio_producto;
	 
	 @Column(name="stock_producto")
	 private int stock_producto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public double getPrecio_producto() {
		return precio_producto;
	}

	public void setPrecio_producto(double precio_producto) {
		this.precio_producto = precio_producto;
	}

	public int getStock_producto() {
		return stock_producto;
	}

	public void setStock_producto(int stock_producto) {
		this.stock_producto = stock_producto;
	}

	

}
