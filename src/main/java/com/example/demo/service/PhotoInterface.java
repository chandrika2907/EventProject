package com.example.demo.service;

import java.util.List;


import com.example.demo.entities.Photo;

public interface PhotoInterface {
	public String addPhotos(Photo photo);

	public List<Photo> fetchallPhotos();
	public void updatePhoto(Photo photo);
}
