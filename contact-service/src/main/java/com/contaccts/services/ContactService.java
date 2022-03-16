package com.contaccts.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contaccts.entities.Contact;
import com.contaccts.repo.ContactRepo;

@Service 
public class ContactService implements ContactRepo{

	List<Contact> contacts=getFakeContacts();
	
	@Override
	public List<Contact> getContactsbyUserId(Integer id) {
		List<Contact> contact=contacts.stream().filter(cont->cont.getUserId().equals(id)).collect(Collectors.toList());
		return contact;
	}
	
	

}
