package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	@GetMapping("map-photo")
	public String addPhotos() {
		return "addphotos";
	}
	@GetMapping("map-event")
		public String createEvent() {
			return "createEvent";
		}
	}



