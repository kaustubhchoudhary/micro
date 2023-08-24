package com.contact.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entities.Contact;

@Service
public class ContactServicesImpl implements ContactServices {

	List<Contact> contactsList = List.of(
				new Contact(1, "kaustubhchoudhary@rediff.com", "Kaustubh", 1),
				new Contact(2, "kaustubhchoudhary@yahoo.com", "Kaustubh", 1),
				new Contact(4, "abhishek@gmail.com", "Abhishek", 2),
				new Contact(5, "abhishek@yahoo.com", "Abhishek", 2),
				new Contact(6, "ashutosh@rediff.com", "Ashu", 3)
			);
	
	@Override
	public List<Contact> getContactsOfUserWith(int id) {
		return contactsList.stream().filter(contact->contact.getUserId()==id)
				.collect(Collectors.toList());
	}

}
