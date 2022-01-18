package com.marticus.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.marticus.project.entity.ProjectEntity;
import com.marticus.project.repo.ProjectRepository;


@Service
public class ProjectService {

	@Autowired
	ProjectRepository projectRepository;


	public List<ProjectEntity> findAllProject() {
		// TODO Auto-generated method stub
		return projectRepository.findAll(Sort.by(Sort.Direction.ASC,"name"));
	}

	public ProjectEntity findprojectById(int id) {
		// TODO Auto-generated method stub
		return projectRepository.findProjectById(id);
	}

//	public ProjectEntity findProjectById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	
}