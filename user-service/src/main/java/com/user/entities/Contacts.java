package com.user.entities;


public class Contacts {
	
	private Integer Id;
	private String name;
	private Integer phone;
	private Integer userId;
	
	
	
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contacts(Integer id, String name, Integer phone, Integer userId) {
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
