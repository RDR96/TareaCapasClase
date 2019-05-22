package com.rdr.capas.services;

import java.util.List;

import com.rdr.capas.domain.Book;

public interface BookService {
	public List<Book> findAll();
	public Integer countDistinctAuthors();
	public Integer countBooks();
	public List<Book> findBySelection(String columnName, String value);
	
}
