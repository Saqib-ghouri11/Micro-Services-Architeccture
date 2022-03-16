package com.user.dao;

import java.util.List;

import com.user.entities.User;

public interface UserRepo {
	
	User getUserById(Integer id);
	
	default List<User> fakeData(){
		List<User> users=List.of(
				new User(1,"Saqib","saqib@example.com","0312223343"),
				new User(2,"Ahsen","Ahsen@example.com","03223344554"),
				new User(3,"Shujjat","Shujjat@example.com","03112233445"),
				new User(4,"Zohaib","Zohaib@example.com","03467655674")
				);
		return users;
	}

}
