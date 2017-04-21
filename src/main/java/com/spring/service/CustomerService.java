package com.spring.service;

import java.util.List;

import com.spring.model.Customer;

public interface CustomerService {

	public abstract List<Customer> findAll();

}