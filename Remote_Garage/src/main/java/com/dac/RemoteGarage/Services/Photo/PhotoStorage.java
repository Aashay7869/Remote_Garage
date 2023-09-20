package com.dac.RemoteGarage.Services.Photo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class PhotoStorage {
	
	
@Autowired
Photo photo;
	
	
public String fileUpload(MultipartFile file){
		
		try {
			
		final String file_dir=new ClassPathResource("static/images/").getFile().getAbsolutePath();
		
		String newFileName = photo.changeName(file.getOriginalFilename());
		Files.copy(file.getInputStream(),Paths.get(file_dir+File.separator+newFileName),StandardCopyOption.REPLACE_EXISTING);
		return newFileName;
		}catch(Exception e) {
			System.out.println(e);
		}
		return "image not upload";
	}

}
