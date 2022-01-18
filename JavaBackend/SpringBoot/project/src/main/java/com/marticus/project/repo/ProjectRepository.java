package com.marticus.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marticus.project.entity.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {

	ProjectEntity findProjectById(int id);

}
