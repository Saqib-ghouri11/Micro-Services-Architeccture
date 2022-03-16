package com.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.dao.UserRepo;
import com.user.entities.Contacts;
import com.user.entities.User;

@Service
public class UserService implements UserRepo {
	List<User> users=fakeData();
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public User getUserById(Integer id) {
		
		User user=users.stream().filter(usr->usr.getId().equals(id)).findAny().orElse(null);
		
		@SuppressWarnings("unchecked")
		List<Contacts> cont=restTemplate.getForObject("http://contact-service/contact/user/"+id, List.class);
		
		user.setContacts(cont);
		
		return user;
	}

}
