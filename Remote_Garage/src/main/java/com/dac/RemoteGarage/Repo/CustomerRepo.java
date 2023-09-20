package com.dac.RemoteGarage.Repo;





//import java.util.List;


import org.springframework.data.repository.CrudRepository;


import com.dac.RemoteGarage.Entity.Customer;




public interface CustomerRepo extends CrudRepository<Customer,String> {
	
	
	//public List<Customer> findBycId(String cId);;
	
//	@Query("Select u from Customer u where u.cust_Email=:n")
//	public Customer validate(@Param("n") String email);
	
	
	
}
