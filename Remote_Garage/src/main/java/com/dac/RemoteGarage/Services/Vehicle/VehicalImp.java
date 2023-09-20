package com.dac.RemoteGarage.Services.Vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.RemoteGarage.Entity.VehicleProblem;
import com.dac.RemoteGarage.Repo.VechialRepo;
@Service
public class VehicalImp implements VehicleService {

	@Autowired
	VechialRepo vechialRepo;
	
	@Override
	public void insertVehicle(VehicleProblem vehicleProblem) {
		
		this.vechialRepo.save(vehicleProblem);
		System.out.println("data sent");
	}

	@Override
	public List<VehicleProblem> getProblem() {
		List<VehicleProblem> problemList=(List<VehicleProblem>) vechialRepo.findAll();
		return problemList;
	}

}
