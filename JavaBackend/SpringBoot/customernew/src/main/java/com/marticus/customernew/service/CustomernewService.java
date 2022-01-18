package com.marticus.customernew.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.marticus.customernew.entity.CustomernewEntity;
import com.marticus.customernew.repo.CustomernewRepository;



@Service
public class CustomernewService {
	
	@Autowired
	CustomernewRepository customernewRepository;
	
	public void saveCustomer(CustomernewEntity customerEnt) {
		
		
		customernewRepository.save(customerEnt);
	}
	
	public CustomernewEntity findCustomerById(long id)
	{
		return customernewRepository.findCustomerById(id);
	}

	public List<CustomernewEntity> findAllCustomers() {
		
		return customernewRepository.findAll(Sort.by(Sort.Direction.ASC,"customerName"));

	}
	
	public Boolean deleteDepartmentById(Long id)
	{
		CustomernewEntity cust=customernewRepository.findCustomerById(id);
		if(cust!=null)
		{
			customernewRepository.delete(cust);
		
		return true;
		
	}
	return false;
	}
	

	public CustomernewEntity update(CustomernewEntity customerEntity) {
		// TODO Auto-generated method stub
		CustomernewEntity custDB = customernewRepository.findCustomerById(customerEntity.getId());
		custDB.setCustomerName(customerEntity.getCustomerName());
		custDB.setCustomerCode(customerEntity.getCustomerCode());
		customernewRepository.save(custDB);
		return custDB;
		
	}

	public Boolean deleteCustomerById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CustomernewEntity> findCustomerByName(String name) {
		
		
		return customernewRepository.findCustomerByCustomerName(name);
		// TODO Auto-generated method stub
	 
	}

	public List<CustomernewEntity> findCustomerByNameLike(String name) {
		return customernewRepository.findCustomerByCustomerNameContaining(name);
	 
		 
	}

	public List<CustomernewEntity> findCustomerByNameAndCustomerId(String name, String custId) {
		
		 return customernewRepository.findCustomerByCustomerNameContainingAndCustomerCode(name,custId);
	}
	
}