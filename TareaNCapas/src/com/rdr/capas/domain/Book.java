package com.rdr.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="book")
public class Book {
	
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="titulo")
	private String name;
	
	@Column(name="autor")
	private String author;
	
	@Column(name="genero")
	private String category;
	
	@Column(name="isbn")
	private String number;
	
	
	private int cantidad;
	
	
	public Book() {
		
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setAutor(String authorId) {
		this.author = authorId;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setGenero(String categoryId) {
		this.category = categoryId;
	}
	
	public void setTitulo(String name) {
		this.name = name;
	}
	
	public String getAutor() {
		return author;
	}
	
	public String getGenero() {
		return category;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getTitulo() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	
}
