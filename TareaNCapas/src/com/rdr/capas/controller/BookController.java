package com.rdr.capas.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rdr.capas.classes.LibraryForm;
import com.rdr.capas.classes.ParameterType;
import com.rdr.capas.domain.Book;
import com.rdr.capas.services.BookService;


@Controller
public class BookController {
	
	@Autowired
	public BookService bookService;
	
	@RequestMapping("/search-by-value")	
	public ModelAndView librarySearch(@Valid @ModelAttribute LibraryForm library, BindingResult result) {
				
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			
			ArrayList<ParameterType> parameterList = new ArrayList<>();
			
			LibraryForm libraryForm = new LibraryForm();
			
			parameterList.add(new ParameterType("titulo","Título"));		
			parameterList.add(new ParameterType("autor","Autor"));
			parameterList.add(new ParameterType("genero","Género"));
			parameterList.add(new ParameterType("isbn","ISBN"));
			
			mav.addObject("parameterTypes", parameterList);
			
			mav.setViewName("main");
			
			return mav;
		}
		
		List<Book> libros = bookService.findBySelection(library.getSearchParam(), library.getSearchValue());
		
		mav.addObject("libros", libros);
		mav.addObject("dato", library.getSearchValue() );
		mav.addObject("criterio", library.getSearchParam().substring(0,1).toUpperCase() + library.getSearchParam().substring(1));
		mav.addObject("cantidad", libros.size());
		
		mav.setViewName("library-filtered");
		
		return mav;
	}
	
	@RequestMapping("/see-all")	
	public ModelAndView searchAll(@ModelAttribute LibraryForm library) {
		
		ModelAndView mav = new ModelAndView();
		
		List<Book> libros = bookService.findAll();
		int distinctNumberOfAuthors = bookService.countDistinctAuthors();
		int numberOfBooks = bookService.countBooks();
		
		mav.addObject("libros", libros);
		mav.addObject("distinctNumberOfAuthors", distinctNumberOfAuthors);
		mav.addObject("booksNumber", numberOfBooks);
		mav.setViewName("library-catalog");
		
		return mav;
	}
}
