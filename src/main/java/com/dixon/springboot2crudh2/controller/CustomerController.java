/**
 * @author dixon
 *
 */
package com.dixon.springboot2crudh2.controller;

import javax.validation.Valid;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dixon.springboot2crudh2.model.Customer;
import com.dixon.springboot2crudh2.repository.CustomerRepository;

/**
 * @author dixon
 *
 */
@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping("/customers")
	public Customer createCustomer(@Valid @RequestBody Customer customer) {
		return customerRepository.save(customer);
	}

}
