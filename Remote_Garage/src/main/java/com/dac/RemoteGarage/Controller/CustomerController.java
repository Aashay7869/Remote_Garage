package com.dac.RemoteGarage.Controller;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dac.RemoteGarage.Entity.Customer;
import com.dac.RemoteGarage.Entity.CustomerLogin;
import com.dac.RemoteGarage.Services.Customer.CustomerService;
import com.dac.RemoteGarage.Services.Mechanic.MechanicServices;

@RestController
@CrossOrigin
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	
	@PostMapping("/registerCustomer")
	@ResponseBody
	public String addCustomer(@RequestBody Customer customer)
	{
	this.customerService.insertCustomer(customer);
		return "jamla";
	}  
	
	@PostMapping("/loginCustomer")
	@ResponseBody
	public Boolean loginCustomer(@RequestBody CustomerLogin customerLogin) {
		Boolean ans= customerService.validateLogin(customerLogin);
		
		return ans;
	} 
	
	@GetMapping("/getCustomer/{id}")
	@ResponseBody
	public Customer getCustomer(@PathVariable("id") String cId)
	{
		System.out.println(customerService.fetchCustomer(cId));
		return customerService.fetchCustomer(cId); 
	}
	

}
