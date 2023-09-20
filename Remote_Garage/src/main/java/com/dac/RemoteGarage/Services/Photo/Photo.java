package com.dac.RemoteGarage.Services.Photo;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class Photo {

	private String imageName;
	
	
	
	public String changeName(String originalFilename) {
		String ext = originalFilename.substring(originalFilename.lastIndexOf('.'));		
		 imageName = UUID.randomUUID().toString() + ext;
		 return imageName;
	}

	public Photo(String imageName) {
		super();
		this.imageName = imageName;
	}

	public Photo() {
		super();
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	
	
}
