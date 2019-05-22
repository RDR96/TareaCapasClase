package com.rdr.capas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdr.capas.dao.LibraryDAO;
import com.rdr.capas.domain.Book;

@Service
public class BookServiceImplement implements BookService{
	
	@Autowired 
	LibraryDAO libraryDao;

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		
		return libraryDao.findAll();
	}
	
	@Override
	public Integer countDistinctAuthors() {
		// TODO Auto-generated method stub
		
		return libraryDao.countDistinctAutors();
	}
	
	@Override
	public Integer countBooks() {
		// TODO Auto-generated method stub
		
		return libraryDao.countBooks();
	}

	@Override
	public List<Book> findBySelection(String columnName, String value) {
		// TODO Auto-generated method stub									
		return libraryDao.findOne(columnName, value);
	}
	
	
	

}
