package com.contact.services;

import java.util.List;

import com.contact.entities.Contact;

public interface ContactServices {
	public List<Contact> getContactsOfUserWith(int id);
}
