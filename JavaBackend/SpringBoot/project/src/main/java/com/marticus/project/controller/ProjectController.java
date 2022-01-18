package com.marticus.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.marticus.project.entity.ProjectEntity;
import com.marticus.project.service.ProjectService;

@RestController
@RequestMapping("/Project")

public class ProjectController {

	@Autowired
		ProjectService projectService;
		
		@Autowired
		RestTemplate template;
		
		@GetMapping("/")
		public ResponseEntity<List<ProjectEntity>>getAll()
		{
			List<ProjectEntity> empList= projectService.findAllProject();
			return ResponseEntity.ok(empList);
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<ProjectEntity>getProject(@PathVariable("id") int id)
		{
			ProjectEntity projectEntity= projectService.findprojectById(id);
			return ResponseEntity.ok(projectEntity);
		}
		
		
}
