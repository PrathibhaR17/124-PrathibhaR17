package com.marticus.technology.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marticus.technology.entity.TechnologyEntity;



public interface TechnologyRepository  extends JpaRepository<TechnologyEntity, Integer> {

	List<TechnologyEntity> findAll();

	TechnologyEntity findTechnologyById(int id);
//
//	List<TechnologyEntity> findAll(Sort by);

}
