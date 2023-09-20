package com.dac.RemoteGarage.Services.Vehicle;



import java.util.List;


import com.dac.RemoteGarage.Entity.VehicleProblem;

public interface VehicleService {
public void insertVehicle(VehicleProblem vehicleProblem);
public List<VehicleProblem> getProblem();
}
