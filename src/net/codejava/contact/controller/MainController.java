package net.codejava.contact.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.contact.dao.contactDAO;
import net.codejava.contact.model.Contact;

@Controller
public class MainController {
	
	@Autowired
	private contactDAO ContactDAO;
	
	@RequestMapping(value="/")
	public ModelAndView listContact(ModelAndView model) {
		List<Contact> listContact =ContactDAO.list();
		model.addObject("listContact", listContact);
		model.setViewName("index");
		
		
		return model;		
	}
	
	@RequestMapping(value="/new", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Contact newContact = new Contact();
		model.addObject("contact", newContact);
		model.setViewName("contact_form");
		
		
		return model;		
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute Contact contact) {
		
	         
		ContactDAO.save(contact);

		return new ModelAndView("redirect:/");		
	}
	
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public ModelAndView deleteContact(@RequestParam Integer id) {
		ContactDAO.delete(id);
				
		
		return new ModelAndView("redirect:/");		
	}
	
	
	
}
