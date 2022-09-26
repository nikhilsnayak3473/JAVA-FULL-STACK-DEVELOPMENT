package com.nikhilsnayak3473.springmvcdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nikhilsnayak3473.springmvcdemo.dto.Person;
import com.nikhilsnayak3473.springmvcdemo.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	private PersonService personService;
	private String msg;

	@RequestMapping(path = "/home")
	public ModelAndView showHome() {
		ModelAndView modelAndView = new ModelAndView("index.jsp");

		List<Person> persons = personService.getAllPersons();

		modelAndView.addObject("persons", persons);

		return modelAndView;
	}

	@RequestMapping(path = "/msg")
	public ModelAndView showMessage() {
		ModelAndView modelAndView = new ModelAndView("msg.jsp");
		modelAndView.addObject("msg", this.msg);
		return modelAndView;
	}

	@RequestMapping(path = "/add", method = RequestMethod.GET)
	public ModelAndView showRegisterForm() {
		ModelAndView modelAndView = new ModelAndView("register-form.jsp");

		modelAndView.addObject("person", new Person());

		return modelAndView;
	}

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String savePerson(@ModelAttribute Person person) {

		Person result = personService.addPerson(person);

		if (result != null) {
			this.msg = "PERSON SAVED SUCCESSFULLY ID: " + result.getId();
		} else {
			this.msg = "FAILED TO SAVE PERSON TRY AGAIN!!";
		}

		return "forward:/msg";

	}

	@RequestMapping(path = "/remove")
	public String removePerson(@RequestParam(name = "id") int id) {
		Person result = personService.removePerson(id);

		if (result != null) {
			this.msg = "COULD NOT DELETE THE PERSON TRY AGAIN!!";
			return "forward:/msg";
		}

		return "forward:/home";

	}
	
	@RequestMapping(path = "/update", method = RequestMethod.GET)
	public ModelAndView showUpdateForm(@RequestParam(name="id") int id) {
		ModelAndView modelAndView = new ModelAndView("update-form.jsp");
		
		Person person = personService.getPersonById(id);

		modelAndView.addObject("person", person);

		return modelAndView;
	}
	
	@RequestMapping(path = "/update", method = RequestMethod.POST)
	public String updatePerson(@ModelAttribute Person person) {
		
		Person result = personService.updatePerson(person);
		
		if(result == null) {
			this.msg = "COULD NOT UPDATE THE PERSON TRY AGAIN!!";
			return "forward:/msg";
		}
		
		
		return "forward:/home";
		
	}
}
