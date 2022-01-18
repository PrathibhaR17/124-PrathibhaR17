package com.marticus.technology.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.marticus.technology.entity.TechnologyEntity;
import com.marticus.technology.service.TechnologyService;



@RestController
@RequestMapping("/Technology")

public class TechnologyController {
	
	@Autowired
TechnologyService technologyService;
	
	@Autowired
	RestTemplate template;
	
	@GetMapping("/")
	public ResponseEntity<List<TechnologyEntity>>getAll()
	{
		List<TechnologyEntity> techList= technologyService.findAllTechnology();
		return ResponseEntity.ok(techList);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<TechnologyEntity>getTechnology(@PathVariable("id") int id)
	{
		TechnologyEntity technologyEntity= technologyService.findTechnologyById(id);
		return ResponseEntity.ok(technologyEntity);
	}
	

}
