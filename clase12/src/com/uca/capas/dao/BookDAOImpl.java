package com.uca.capas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import com.uca.capas.domain.Book;

@Repository
public class BookDAOImpl implements BookDAO {
	
	@PersistenceContext(unitName = "library")
	private EntityManager entityManager;

	@Override
	public List<Book> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.book");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		List<Book> res = query.getResultList();
		
		return res;
	}

	@Override
	public List<Book> findBy(String filtrar, String codigo) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.book where " + String.valueOf(filtrar) + "~*" + "'" + String.valueOf(codigo)+ "'");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		List<Book> c = query.getResultList();
		return c;
	}
	
	@Override
	public int dautores() throws DataAccessException{
		StringBuffer sb = new StringBuffer();
		sb.append("select count(distinct autor) from public.book");
		Query query = entityManager.createNativeQuery(sb.toString());
		int dautores = ((Number) query.getSingleResult()).intValue();
		return dautores;
	}
	
	@Override
	public int sumtotal() throws DataAccessException{
		StringBuffer sb = new StringBuffer();
		sb.append("select sum(cantidad) from public.book");
		Query query = entityManager.createNativeQuery(sb.toString());
		int sumtotal = ((Number) query.getSingleResult()).intValue();
		return sumtotal;
	}
	

}
