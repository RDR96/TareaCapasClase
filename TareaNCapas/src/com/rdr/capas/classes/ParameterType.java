package com.rdr.capas.classes;

public class ParameterType {
	private String name;
	private String columnName;
	
	public ParameterType() {
		
	}
	
	public ParameterType(String id, String name) {
		this.columnName = id;
		this.name = name;
	}
	
	public void setColumnName(String id) {
		this.columnName = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColumnName() {
		return this.columnName;
	}
	
	public String getName() {
		return this.name;
	}

	

}
