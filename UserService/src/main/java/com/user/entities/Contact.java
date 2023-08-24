package com.user.entities;

public class Contact {
	private int id;
	private String emailId;
	private String contactName;
	private int userId;

	public Contact() {
		super();
	}

	public Contact(int id, String emailId, String contactName, int userId) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.contactName = contactName;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", emailId=" + emailId + ", contactName=" + contactName + ", userId=" + userId
				+ "]";
	}

}
