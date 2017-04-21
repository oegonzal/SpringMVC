package com.spring.repository;

import java.util.List;

import com.spring.model.Customer;

public interface CustomerRepository {

	public abstract List<Customer> findAll();

}