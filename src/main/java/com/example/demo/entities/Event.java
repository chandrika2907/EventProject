package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String description;
	
	@ManyToMany(fetch = FetchType.EAGER)
	List<Photo>photoslist;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(int id, String name, String description, List<Photo> photoslist) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.photoslist = photoslist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Photo> getPhotoslist() {
		return photoslist;
	}

	public void setPhotoslist(List<Photo> photoslist) {
		this.photoslist = photoslist;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", description=" + description + ", photoslist=" + photoslist
				+ "]";
	}
	
	

}
