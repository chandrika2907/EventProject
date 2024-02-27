package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Photo;
import com.example.demo.repository.Photorepo;
@Service
public class PhotoServices implements PhotoInterface {
	@Autowired
	Photorepo repo;

	

	@Override
	public String addPhotos(Photo photo) {
		repo.save(photo);
		return "photos are added";
	}



	
	public List<Photo> viewPhotos() {
	List<Photo> photos=repo.findAll();
		return photos;
		
		
	}
	@Override
	public List<Photo> fetchallPhotos() {
		List<Photo>photoslist=repo.findAll();
		return photoslist;
	
	}


	public void updatePhoto(Photo photo) 
	{
		repo.save(photo);
	}


}
