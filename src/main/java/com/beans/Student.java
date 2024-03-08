package com.beans;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	String name;
	Integer age ;
	ArrayList<String> mobileno;
	@Autowired
	Address address;
	
	public Student() {
		System.out.println("Student class contructor called...!!!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public ArrayList<String> getMobileno() {
		return mobileno;
	}
	public void setMobileno(ArrayList<String> mobileno) {
		this.mobileno = mobileno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
