package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Photo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
	String link;
	
	@ManyToMany
	List<Event>event;
	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Photo(int id, String link, List<Event> event) {
		super();
		this.id = id;
		this.link = link;
		this.event = event;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<Event> getEvent() {
		return event;
	}
	public void setEvent(List<Event> event) {
		this.event = event;
	}
	@Override
	public String toString() {
		return "Photo [id=" + id + ", link=" + link + ", event=" + event + "]";
	}
	
	
}
