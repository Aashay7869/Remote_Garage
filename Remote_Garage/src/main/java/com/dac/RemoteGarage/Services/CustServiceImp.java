package com.dac.RemoteGarage.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.RemoteGarage.Entity.Customer;
import com.dac.RemoteGarage.Repo.CustomerRepo;




@Service
public  class CustServiceImp implements CustomerService {
@Autowired
CustomerRepo customerRepo;




	@Override
	public void insert(Customer customer) {
	this.customerRepo.save(customer);
System.out.println("Jama gaya");
	}
}
