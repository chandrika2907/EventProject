package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.entities.Photo;
import com.example.demo.service.PhotoServices;


@Controller
public class Photocon {
	@Autowired
	PhotoServices serv;
	@PostMapping("addphotos")
	public String addPhotos(@ModelAttribute Photo photo) {
		serv.addPhotos(photo);
		return "photosuccess";
		
	}

	@GetMapping("view-photos")
	public String viewPhotos(Model model) {
	
		List<Photo> photos=serv.viewPhotos();
		model.addAttribute("photos",photos);
		
		return "displayphotos";
		
		
	}
	

}
