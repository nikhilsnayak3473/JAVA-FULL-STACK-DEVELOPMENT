package com.nikhilsnayak3473.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhilsnayak3473.springbootdemo.dto.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
