package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entities.Event;
import com.example.demo.repository.EventRepo;


@Service
public class EventService implements EventInterface {
	@Autowired
	EventRepo er;

	@Override
	public void addEvent(Event event) {
	er.save(event);
		
	}

	

	@Override
	public List<Event> fetchEvent() {
		return er.findAll();
	}

}
