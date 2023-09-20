package com.dac.RemoteGarage.Controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dac.RemoteGarage.Entity.Services;
import com.dac.RemoteGarage.Services.MechanicServices.MechServices;



@RestController
@CrossOrigin
public class ServicesController {
@Autowired
MechServices mechanicServices;

@PostMapping("/addServices")
public String addServices(@RequestBody Services services)

{
	this.mechanicServices.insertServices(services);
	return "add hogai";
}



@GetMapping("/getServices")
@ResponseBody
public List<Services> fetchServices()
{
	List<Services> mServices=mechanicServices.getServices();
	return mServices;
}

}
