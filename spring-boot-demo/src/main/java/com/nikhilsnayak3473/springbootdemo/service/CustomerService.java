package com.nikhilsnayak3473.springbootdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.nikhilsnayak3473.springbootdemo.dao.CustomerDao;
import com.nikhilsnayak3473.springbootdemo.dto.Customer;
import com.nikhilsnayak3473.springbootdemo.exception.NoIdFoundException;
import com.nikhilsnayak3473.springbootdemo.util.Message;
import com.nikhilsnayak3473.springbootdemo.util.ResponseStructure;

@Service
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;

	public Message saveCustomer(Customer customer) {
		Boolean saved = customerDao.saveCustomer(customer);
		Message message = new Message();

		if (saved) {
			message.setMessage("Customer saved sucessfully");
		} else {
			message.setMessage("Could not save customer try again");
		}

		return message;
	}

	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

	public ResponseStructure<Customer> getCustomerById(Integer id) {
		Customer customer = customerDao.getCustomerById(id);
		ResponseStructure<Customer> responseStructure = new ResponseStructure<Customer>();

		if (customer != null) {
			responseStructure.setStatusCode(HttpStatus.FOUND.value());
			responseStructure.setMessage("Customer Found");

		} else {
			throw new NoIdFoundException("Id is invalid");

		}
		responseStructure.setData(customer);

		return responseStructure;
	}

	public Message deleteCustomerById(Integer id) {
		Boolean deleted = customerDao.deleteCustomerById(id);
		Message message = new Message();

		if (deleted == null) {
			message.setMessage("Customer Not found");

		} else if (deleted) {
			message.setMessage("Customer Deleted Successfully");
		}

		else {
			message.setMessage("Could not delete customer try again");
		}

		return message;

	}

	public Message updateCustomerById(Integer id, Customer customer) {
		Boolean updated = customerDao.updateCustomerById(id, customer);
		Message message = new Message();
		if (updated) {
			message.setMessage("Customer Updated Successfully");
		} else {
			message.setMessage("Could not Update customer try again");
		}

		return message;
	}

}
