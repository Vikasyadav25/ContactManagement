package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.configuration.Contact;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
//	Get all List of CONTACT method
	public List<Contact> getAllContacts(){
		List<Contact> obj= new ArrayList<>();
		contactRepository.findAll().forEach(obj::add);
		return obj;
	}
//	add a CONTACT List of CONTACT method
	public void  addContacts(Contact contact){
		contactRepository.save(contact);
		System.out.println("added Successfully");
	}
//	update a CONTACT List of CONTACT method
	public void  updateContacts(Integer id, Contact contact){
		contactRepository.save(contact);
		System.out.println("updated Successfully");
	}
//	delete a CONTACT List of CONTACT method
	public void deleteContacts(Integer id){
		contactRepository.deleteById(id);
		System.out.println("delected Successfully");
	}
}
