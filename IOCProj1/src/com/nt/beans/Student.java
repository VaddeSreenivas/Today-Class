package com.nt.beans;

public class Student{
	private String name;
	private int id;
	private String address;
	
	//0-param constructor
	/*public Student() {
		
	}*/
	//parametarized constructor
	public Student(String name, int id,String address) {
		this.name = name;
		this.id = id;
		this.address=address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
