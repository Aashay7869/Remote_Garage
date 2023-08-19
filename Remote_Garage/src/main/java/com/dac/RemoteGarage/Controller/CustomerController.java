package com.dac.RemoteGarage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dac.RemoteGarage.Entity.Customer;
import com.dac.RemoteGarage.Services.CustomerService;

@RestController
@CrossOrigin
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/register")
	@ResponseBody
	public String add(@RequestBody Customer customer)
	{
	this.customerService.insert(customer);
		return "jamla";
	}

}
