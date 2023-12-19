package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.configuration.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
