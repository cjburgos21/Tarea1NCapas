package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="book")
public class Book {
		
	@Id
	@Column(name="id")
	private Integer identificador;
	
	@Column(name="titulo")
	private String n_titulo;
	
	@Column(name="autor")
	private String escritor;
	
	@Column(name="genero")
	private String tipo;
	
	@Column(name="isbn")
	private String pcode;
	
	@Column(name="cantidad")
	private Integer total;
	
	public Book(Integer identificador, String n_titulo, String escritor, String tipo, String pcode, Integer total) {
		super();
		this.identificador = identificador;
		this.n_titulo = n_titulo;
		this.escritor = escritor;
		this.tipo = tipo;
		this.pcode = pcode;
		this.total = total;
	}
	
	public Book() {
		super();
	}
	
	public Integer getidentificador() {
		return identificador;
	}
	
	public void setidentificador(Integer identificador) {
		this.identificador = identificador;
	}
	
	
	public String getn_titulo() {
		return n_titulo;
	}
	
	public void setn_titulo(String n_titulo) {
		this.n_titulo = n_titulo;
	}
	
	public String getescritor() {
		return escritor;
	}
	
	public void setescritor(String escritor) {
		this.escritor = escritor;
	}
	
	public String gettipo() {
		return tipo;
	}
	
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getcode() {
		return pcode;
	}
	
	public void setcode(String pcode) {
		this.pcode = pcode;
	}
	
	public Integer gettotal() {
		return total;
	}
	
	public void settotal(Integer total) {
		this.total = total;
	}
		
	
	
}