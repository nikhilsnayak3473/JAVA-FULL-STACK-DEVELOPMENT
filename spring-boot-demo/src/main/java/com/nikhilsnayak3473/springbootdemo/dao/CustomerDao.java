package com.nikhilsnayak3473.springbootdemo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nikhilsnayak3473.springbootdemo.dto.Customer;
import com.nikhilsnayak3473.springbootdemo.repository.CustomerRepository;

@Repository
public class CustomerDao {

	@Autowired
	private CustomerRepository customerRepository;

	public Boolean saveCustomer(Customer customer) {
		return customerRepository.save(customer) != null;
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public Customer getCustomerById(Integer id) {
		Optional<Customer> optional =  customerRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();

	}

	public Boolean deleteCustomerById(Integer id) {
		Customer customer = getCustomerById(id);
		if (customer == null) {
			return null;
		}

		customerRepository.delete(customer);

		return true;

	}

	public Boolean updateCustomerById(Integer id, Customer customer) {
		Customer customer2 = getCustomerById(id);
		if (customer2 == null) {
			return null;
		}
		
		customer.setId(id);

		return customerRepository.save(customer) != null;
	}

}
