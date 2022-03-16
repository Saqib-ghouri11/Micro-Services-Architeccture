package com.contaccts.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contaccts.entities.Contact;
import com.contaccts.services.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	ContactService contService;
	
	@GetMapping("user/{id}")
	public List<Contact> getUserContacts(@PathVariable("id") Integer id){
		return contService.getContactsbyUserId(id);
	}

}
