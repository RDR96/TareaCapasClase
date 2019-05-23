package com.rdr.capas.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.rdr.capas.domain.Book;

@Repository
public class LibraryDaoImplement implements LibraryDAO{

	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;
	
	@Override
	public List<Book> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("SELECT * FROM public.book");
		
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		
		List<Book> listsOfBooks = query.getResultList();				
		
		
		return listsOfBooks;
	}
	
	@Override
	public Integer countDistinctAutors() throws DataAccessException {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("SELECT COUNT(DISTINCT autor) FROM book;");
		
		Query query = entityManager.createNativeQuery(sb.toString());									

		
		return Integer.valueOf(query.getSingleResult().toString());
	}
	
	@Override
	public Integer countBooks() throws DataAccessException {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("SELECT SUM(cantidad) FROM book;");
		
		Query query = entityManager.createNativeQuery(sb.toString());									
		
		
		return Integer.valueOf(query.getSingleResult().toString());
	}

	@Override
	public List<Book> findOne(String columnName, String value) throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();		
		
		sb.append("SELECT * FROM public.book WHERE " + columnName + " ~* :value");
				
		
		
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		query.setParameter("value", value);
	
		List<Book> listOfBooks = query.getResultList();
		
		System.out.println("El tamaño es: " + listOfBooks.size());
		
		return listOfBooks;
	}

}
