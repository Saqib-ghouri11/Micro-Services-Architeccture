package com.contaccts.repo;

import java.util.List;

import com.contaccts.entities.Contact;

public interface ContactRepo {
	
	List<Contact> getContactsbyUserId(Integer id);
	
	default List<Contact> getFakeContacts(){
		List<Contact> contacts=List.of(
				new Contact(12,"Shahwar",03445454343,1),
				new Contact(13,"Nadim",03445454343,1),
				new Contact(14,"Qasim",03445454343,1),
				new Contact(15,"Akmal",03445454343,2),
				new Contact(16,"Sameer",03445454343,2),
				new Contact(17,"Sultan",03445454343,3),
				new Contact(18,"Salman",03445454343,4),
				new Contact(19,"Shahwar",03445454343,4)
				);
		return contacts;
	}

}
