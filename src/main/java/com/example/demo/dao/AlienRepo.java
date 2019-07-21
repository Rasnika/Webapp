package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

import com.example.demo.model.Alien;



public interface AlienRepo extends JpaRepository<Alien,Integer>
{
	
	

}