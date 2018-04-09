package com.glarimy.directory.api;

import java.util.List;

import com.glarimy.directory.api.exceptions.ContactNotFoundException;
import com.glarimy.directory.api.exceptions.DirectoryException;
import com.glarimy.directory.api.exceptions.DuplicateContactException;
import com.glarimy.directory.api.exceptions.InvalidContactException;
import com.glarimy.directory.api.model.Contact;

public interface Directory {
	public void add(Contact contact) throws DirectoryException, InvalidContactException, DuplicateContactException;

	public void update(Contact contact) throws DirectoryException, InvalidContactException, DuplicateContactException;

	public Contact find(long phoneNumber) throws ContactNotFoundException, DirectoryException;

	public List<Contact> search(int pincode) throws DirectoryException;

	public List<Contact> search(String lastName) throws DirectoryException;
}
