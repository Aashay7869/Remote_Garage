package com.dac.RemoteGarage.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dac.RemoteGarage.Entity.Mechanic;
import com.dac.RemoteGarage.Entity.MechanicLogin;

import com.dac.RemoteGarage.Services.Mechanic.MechanicServices;




@RestController
@CrossOrigin
public class MechanicController {
	
	@Autowired
	MechanicServices mechanicServices;
	//get all service provider


	
	@PostMapping("/registerMechanic")
	@ResponseBody
	public String registerMechanic(@RequestBody Mechanic mechanic) {
	mechanicServices.insertMechanic(mechanic);
	return "ho gaya";
	}

	
	@PostMapping("/loginMechanic")
	@ResponseBody
	public boolean loginMechanic(@RequestBody MechanicLogin mechanicLogin)
	{
		Boolean res=mechanicServices.loginMechanic(mechanicLogin);
		return res;
	}
	
	@GetMapping("/getMechanic/{id}")
	@ResponseBody
	public Mechanic fetchMechanic(@PathVariable("id") String mId ) {
		System.out.println(mId);
		System.out.println(mechanicServices.getMechanic(mId));
		return mechanicServices.getMechanic(mId);
//			return mList;
		
		
	}
}