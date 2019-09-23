package com.prats123.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prats123.dtos.CustomerDto;
import com.prats123.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void save(@RequestBody CustomerDto customerDto) {
		System.out.println("this is it");
		customerService.save(customerDto);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public CustomerDto getCUstomerById(@RequestParam(value = "id", required = true) Long customerId) {
		return customerService.getCustomerById(customerId);

	}

}
