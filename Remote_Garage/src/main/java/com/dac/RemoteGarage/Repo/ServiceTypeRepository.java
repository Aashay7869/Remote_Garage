package com.dac.RemoteGarage.Repo;



import org.springframework.data.repository.CrudRepository;


import com.dac.RemoteGarage.Entity.Services;




public interface ServiceTypeRepository extends CrudRepository<Services, Long> {

	
}