package com.dac.RemoteGarage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dac.RemoteGarage.Entity.VehicleProblem;
import com.dac.RemoteGarage.Services.Photo.PhotoStorage;
import com.dac.RemoteGarage.Services.Vehicle.VehicleService;
@RestController
@CrossOrigin
public class VehicalController {
@Autowired
VehicleService vehicleService;

@Autowired
PhotoStorage photoStorage;

@PostMapping("/insertVehicleProblem")
@ResponseBody
public String addProblem(@RequestBody VehicleProblem vehicleProblem)
{
	System.out.println(vehicleProblem);
	this.vehicleService.insertVehicle(vehicleProblem);
	return "gaya";
	
}
@GetMapping("/getProblems")
@ResponseBody
public List<VehicleProblem> getAllProblems(){
	return vehicleService.getProblem();
}

@PostMapping("/upload")
public String uploadFile(@RequestParam("file")MultipartFile file) {
	

	String newName = photoStorage.fileUpload(file);
		
		
		return newName;
}
}
