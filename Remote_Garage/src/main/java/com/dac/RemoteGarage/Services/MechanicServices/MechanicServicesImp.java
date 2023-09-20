package com.dac.RemoteGarage.Services.MechanicServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.RemoteGarage.Entity.Services;
import com.dac.RemoteGarage.Repo.ServiceTypeRepository;
@Service
public class MechanicServicesImp implements MechServices{
	@Autowired
	ServiceTypeRepository serviceTypeRepository;

	@Override
	public List<Services> getServices() {
	List<Services> servicesList=(List<Services>) serviceTypeRepository.findAll();
		return servicesList;
	}

	@Override
	public void insertServices(Services services) {
		serviceTypeRepository.save(services);
		
	}

	

}
