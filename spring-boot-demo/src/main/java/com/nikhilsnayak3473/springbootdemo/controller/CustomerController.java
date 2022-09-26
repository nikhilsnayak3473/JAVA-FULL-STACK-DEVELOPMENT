package com.nikhilsnayak3473.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nikhilsnayak3473.springbootdemo.dto.Customer;
import com.nikhilsnayak3473.springbootdemo.service.CustomerService;
import com.nikhilsnayak3473.springbootdemo.util.Message;
import com.nikhilsnayak3473.springbootdemo.util.ResponseStructure;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customer")
	public Message saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/customer/{id}")
	public ResponseStructure<Customer> getCustomerById(@PathVariable Integer id) {
		
		return customerService.getCustomerById(id);
		
	}
	
	@DeleteMapping("/customer/{id}")
	public Message deleteCustomerById(@PathVariable Integer id) {
		return customerService.deleteCustomerById(id);
	}
	
	@PutMapping("/customer/{id}")
	public Message updateCustomerById(@PathVariable Integer id, @RequestBody Customer customer) {
		return customerService.updateCustomerById(id, customer);
	}
	
}
