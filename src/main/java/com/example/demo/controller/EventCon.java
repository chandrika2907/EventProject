package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Event;
import com.example.demo.entities.Photo;
import com.example.demo.service.EventService;
import com.example.demo.service.PhotoServices;



@Controller
public class EventCon {
	@Autowired
	EventService es;
	@Autowired
	PhotoServices ps;
	@GetMapping("event")
	public String createEvent(Model model) {
		//fetching the songs by using song service
		List<Photo> photoslist=ps.viewPhotos();
		if(photoslist!=null) 
		{
		//adding the songs in the model
		photoslist = new ArrayList<>();
		model.addAttribute("photoslist",photoslist);
		}
	
		return "createEvent";
	}
	@PostMapping("add-Event")
	public String addPhotos(@ModelAttribute Event event) {
		
		es.addEvent(event);
		 List<Photo>photoslist=event.getPhotoslist();
		//getting all the songs which are present inside the songs list and adding the songs to the playlist object
	
		 for(Photo photo:photoslist) {
		 photo.getEvent().add(event);
		 ps.updatePhoto(photo);
		 }
		
		return "Eventsuccess";
		 
		
	}
	@GetMapping("viewEvent")
	public String viewEvent(Model model) {
		
		List<Event>event=es.fetchEvent();
		model.addAttribute("event",event);
	
		return "viewEvent";
		
		
	}

}







