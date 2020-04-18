package net.codejava.contact.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.codejava.contact.model.Contact;

class contactDAOTest {
/*
	private DriverManagerDataSource dataSource;
	private contactDAO dao;
	
	@BeforeEach
	void setupBeforeEach() {
		
		
		dao = new ContactDAOImpl(dataSource);
	}
	
	
	@Test
	void testSave() {
		Contact contact = new Contact("Dilay2", "Gullu","55555", "istanbul","5533233333", "dilay@hotmail.com","28.08.1998","evet","dgffg","fdgg", "dsfdg", "fgfgf" );
		int result = dao.save(contact);
		
		assertTrue(result > 0);
	
	}

	@Test
	void testUpdate() {
		Contact contact = new Contact(2, "ssafiye", "Gullu", "55555", "istanbul","5533233333", "dilay@hotmail.com","28.08.1998","evet","dgffg","fdgg", "dsfdg", "fgfgf");
		int result = dao.update(contact);
		
		assertTrue(result > 0);
	}
	

	@Test
	void testGet() {
		Integer id=1;
		Contact contact = dao.get(id);
		
		if (contact != null)
		{
			System.out.println(contact);
		}
		assertNotNull(contact);
	}

	@Test
	void testDelete() {
		Integer id = 6;
		int result = dao.delete(id);
		
		assertTrue(result > 0);
	}

	@Test
	void testList() {
		List<Contact> listContacts = dao.list();
		
		for(Contact aContact : listContacts) {
			System.out.println(aContact);
			
		}
		assertTrue(listContacts.isEmpty());
		
	}
	*/

}
