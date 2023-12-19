package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.Contact;
import com.example.demo.service.ContactService;


@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
//	Get all Contact Request
	@RequestMapping("/contact")
	public List<Contact> getAllContacts(){
		return  contactService.getAllContacts();
	}
//	Add Contact Request
	@RequestMapping(method = RequestMethod.POST ,value="/addContact")
	public void addContacts(@RequestBody Contact contact){
		 contactService.addContacts(contact);
	}
//	Update Contact Request
	@RequestMapping(method = RequestMethod.PUT ,value="/updateContact/{id}")
	public  List<Contact>updateContacts(@PathVariable Integer id,@RequestBody Contact contact){
		 contactService.updateContacts(id, contact);
		 return  contactService.getAllContacts();
	}
//	Delete Contact Request
	@RequestMapping(method = RequestMethod.DELETE ,value="/deleteContact/{id}")
	public void deleteContacts(@PathVariable Integer id){
		 contactService.deleteContacts(id);
	}

}
