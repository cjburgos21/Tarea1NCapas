package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.uca.capas.dao.BookDAO;
import com.uca.capas.domain.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookDAO bookdao;
	
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookdao.findAll();
	}

	@Override
	public List<Book> findBy(String filtrar, String codigo) {
		// TODO Auto-generated method stub
			return bookdao.findBy(filtrar,codigo);	
	}
	
	@Override
	public int dautores() {
		return bookdao.dautores();
	}
	
	@Override
	public int sumtotal() {
		return bookdao.sumtotal();
	}
}
