package com.marticus.technology.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.marticus.technology.entity.TechnologyEntity;
import com.marticus.technology.repo.TechnologyRepository;





@Service
public class TechnologyService {


	@Autowired
	TechnologyRepository technologyRepository;


	public List<TechnologyEntity> findAllTechnology() {
		// TODO Auto-generated method stub
		return technologyRepository.findAll(Sort.by(Sort.Direction.ASC,"name"));
	}

	


	public TechnologyEntity findTechnologyById(int id) {
		// TODO Auto-generated method stub
		return technologyRepository.findTechnologyById(id);
	}



//
//	public TechnologyEntity findtechnologyById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
