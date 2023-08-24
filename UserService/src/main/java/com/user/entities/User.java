package com.user.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int id;
	String name;
	String phone;
	List<Contact> contactsList = new ArrayList<Contact>();

	public User() {
		super();
	}

	public User(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public User(int id, String name, String phone, List<Contact> contactsList) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.contactsList = contactsList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContactsList() {
		return contactsList;
	}

	public void setContactsList(List<Contact> contactsList) {
		this.contactsList = contactsList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", contactsList=" + contactsList + "]";
	}

}
