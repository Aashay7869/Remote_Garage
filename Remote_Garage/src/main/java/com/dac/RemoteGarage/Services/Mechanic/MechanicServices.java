package com.dac.RemoteGarage.Services.Mechanic;



import com.dac.RemoteGarage.Entity.Mechanic;
import com.dac.RemoteGarage.Entity.MechanicLogin;



public interface MechanicServices {	
	
	public void insertMechanic(Mechanic mechanic);
	public boolean loginMechanic(MechanicLogin mechanicLogin);
	public Mechanic getMechanic(String str);

	
	
}
