package com.dac.RemoteGarage.Services.Mechanic;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.RemoteGarage.Entity.Mechanic;
import com.dac.RemoteGarage.Entity.MechanicLogin;
import com.dac.RemoteGarage.Repo.MechanicRepo;



@Service
public class MechanicImp implements MechanicServices {
@Autowired
MechanicRepo mechanicRepo;
	@Override
	public void insertMechanic(Mechanic mechanic) {
		mechanicRepo.save(mechanic);
		
	}
	@Override
	public boolean loginMechanic(MechanicLogin mechanicLogin) {
		try {
			Mechanic dbmech=mechanicRepo.findById(mechanicLogin.getId()).get();
			if(mechanicLogin.getId().equals(dbmech.getmId()) && mechanicLogin.getPass().equals(dbmech.getmPassword()))
				return true;
			else {
				return false;
			}
		}
		catch (Exception e) {
			System.out.println("Nahi jamra");
			return false;
		}

	}
	@Override
	public Mechanic getMechanic(String mc) {
		Mechanic mList = mechanicRepo.findById(mc).get();
		return  mList;
	}


}
