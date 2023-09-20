package com.dac.RemoteGarage.Services.MechanicServices;

import java.util.List;

import com.dac.RemoteGarage.Entity.Services;

public interface MechServices {
	public void insertServices(Services services);
	public List<Services> getServices();
}
