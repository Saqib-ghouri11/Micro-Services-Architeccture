package com.contaccts.entities;

public class Contact {
	

	
	private Integer Id;
	private String name;
	private Integer phone;
	private Integer userId;
	
	
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Integer id, String name, Integer phone, Integer userId) {
		super();
		Id = id;
		this.name = name;
		this.phone = phone;
		this.userId = userId;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	

}
