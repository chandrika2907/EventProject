package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entities.Photo;

public interface Photorepo extends JpaRepository<Photo,Integer>{

	

}
