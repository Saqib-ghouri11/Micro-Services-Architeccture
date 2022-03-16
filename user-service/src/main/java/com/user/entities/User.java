package com.user.entities;

import java.util.List;

public class User {
	
	
	private Integer id;
	private String name;
	private String email;
	private String contact;
	private List<Contacts> contacts;
	public User(Integer id, String name, String email,String contact, List<Contacts> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact=contact;
		this.contacts = contacts;
	}
	public User(Integer id, String name, String email,String contact) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact=contact;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Contacts> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contacts> contacts) {
		this.contacts = contacts;
	}

}
