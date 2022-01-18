package com.marticus.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.marticus.project.entity.ProjectEntity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Project")
@NoArgsConstructor
public class ProjectEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	
	
	@Column(name="proj_name")
	String name;
	
	@Column(name="tech_id")
	int techid;

}