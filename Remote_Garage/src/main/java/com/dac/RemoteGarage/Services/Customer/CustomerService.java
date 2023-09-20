package com.dac.RemoteGarage.Services.Customer;



import com.dac.RemoteGarage.Entity.Customer;
import com.dac.RemoteGarage.Entity.CustomerLogin;

public interface CustomerService {
public void insertCustomer(Customer customer);


public Boolean validateLogin(CustomerLogin customerLogin);

public Customer fetchCustomer(String str) ;

	
}
