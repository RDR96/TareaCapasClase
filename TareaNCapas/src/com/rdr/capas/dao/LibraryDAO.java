package com.rdr.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.rdr.capas.domain.Book;

public interface LibraryDAO {
	
	public List<Book> findAll() throws DataAccessException;
	public Integer countDistinctAutors() throws DataAccessException;
	public Integer countBooks() throws DataAccessException;
	public List<Book> findOne(String columnName, String value) throws DataAccessException;
	
}
