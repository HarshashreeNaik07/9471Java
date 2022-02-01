package com.demo.jpaMapMapping.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int e_id;
	private String e_name;
	@ElementCollection
	private Map<Integer, Address> address = new HashMap<Integer, Address>();
	

	public Employee(String e_name) {
		super();
		this.e_name = e_name;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public Map<Integer, Address> getAddress() {
		return address;
	}

	public void setAddress(Map<Integer, Address> address) {
		this.address = address;
	}
	
	
	
}