package com.prats123.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prats123.dtos.CustomerDto;
import com.prats123.entities.CustomerEntity;
import com.prats123.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public void save(CustomerDto customerDto) {
		CustomerEntity ce = new CustomerEntity();
		ce.setName(customerDto.getName());
		ce.setEmail(customerDto.getEmail());
		ce.setPhone(customerDto.getPhone());
		ce.setAddress(customerDto.getAddress());
		customerRepository.save(ce);

	}

	public CustomerDto getCustomerById(Long id) {
		CustomerDto customer = new CustomerDto();
		customer.setName("ram");
		customer.setEmail("ram@gmail.com");
		customer.setPhone("123456789");
		customer.setAddress("nepal");
		return customer;
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
