package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Book;

public interface BookService {
	
	public List<Book> findAll();
		
	public List<Book> findBy(String filtrar, String codigo);
	
	public int dautores();
	
	public int sumtotal();
	
}
