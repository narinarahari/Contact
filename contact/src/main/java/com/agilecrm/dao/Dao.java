package com.agilecrm.dao;

import java.util.List;

import com.agilecrm.dto.Contact;

public interface Dao {
	
	public void saveContact(Contact contact);
	public Contact updateContact(Contact contact);
	public List<Contact> listContact();
	public Contact getContactById(int id);
	public void deleteContact(int id);

}
