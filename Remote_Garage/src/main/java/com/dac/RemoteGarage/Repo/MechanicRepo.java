package com.dac.RemoteGarage.Repo;


import org.springframework.data.repository.CrudRepository;


import com.dac.RemoteGarage.Entity.Mechanic;

public interface MechanicRepo extends CrudRepository<Mechanic, String> {
	
//	@Query("Select u from Customer u where u.mId=:n")
//	public Mechanic fetchMechanic(@Param("n") String mid);
}
