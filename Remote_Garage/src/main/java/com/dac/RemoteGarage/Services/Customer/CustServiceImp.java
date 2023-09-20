package com.dac.RemoteGarage.Services.Customer;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.RemoteGarage.Entity.Customer;
import com.dac.RemoteGarage.Entity.CustomerLogin;

import com.dac.RemoteGarage.Repo.CustomerRepo;




@Service
public  class CustServiceImp implements CustomerService {
@Autowired
CustomerRepo customerRepo;




	@Override
	public void insertCustomer(Customer customer) {
	this.customerRepo.save(customer);
System.out.println("Jam gaya");
	}




	@Override
	public Boolean validateLogin(CustomerLogin customerLogin) {
		
		try {
		Customer dbcust= (Customer) customerRepo.findById(customerLogin.getId()).get();
		System.out.println(dbcust);
		 if(customerLogin.getId().equals(dbcust.getcId())&& customerLogin.getPass().equals(dbcust.getcPass()))
			 return true;
		 
		 else {
			 System.out.println("else");
			 return false;}
		 
		}
		catch(Exception e) {
			System.out.println("catch");
			return false;
		}
	}




	@Override
	public Customer fetchCustomer(String str) {
	Customer cList=	customerRepo.findById(str).get();
		
		return cList;
	}







	
}
