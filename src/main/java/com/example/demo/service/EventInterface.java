package com.example.demo.service;

import java.util.List;


import com.example.demo.entities.Event;

public interface EventInterface {
	public void addEvent(Event event);
	public List<Event> fetchEvent();

}
