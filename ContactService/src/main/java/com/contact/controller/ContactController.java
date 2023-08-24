package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entities.Contact;
import com.contact.services.ContactServices;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactServices contactServices;
	
	@RequestMapping("/user/{id}")
	public List<Contact> getUserContacts(@PathVariable (value="id") int id){
		return this.contactServices.getContactsOfUserWith(id);
	}
}
