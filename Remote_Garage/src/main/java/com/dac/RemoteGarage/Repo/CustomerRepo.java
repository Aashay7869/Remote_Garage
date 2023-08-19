package com.dac.RemoteGarage.Repo;



import org.springframework.data.repository.CrudRepository;

import com.dac.RemoteGarage.Entity.Customer;


public interface CustomerRepo extends CrudRepository<Customer,Integer> {

}
