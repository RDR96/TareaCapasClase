package com.rdr.capas.classes;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LibraryForm {
	private String searchParam;
	
	@NotEmpty(message="No puede estar vacio")
	@Size(message="El maximo de caracteres son 30", max=30)
	private String searchValue;
	
	public LibraryForm () {
		
	}
	
	public LibraryForm (String searchParam, String searchValue) {
		
		this.searchParam = searchParam;
		this.searchValue = searchValue;		
	}
	
	public void setSearchParam(String searchParam) {
		this.searchParam = searchParam;
	}
	
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	
	public String getSearchParam() {
		return searchParam;
	}
	
	public String getSearchValue() {
		return searchValue;
	}
	
}
