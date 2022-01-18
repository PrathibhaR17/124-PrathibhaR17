package com.marticus.customernew.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marticus.customernew.entity.CustomernewEntity;



public interface CustomernewRepository extends JpaRepository<CustomernewEntity, Long>
{
	
	CustomernewEntity findCustomerById(long id);

	List<CustomernewEntity> findCustomerByCustomerName(String name);

	List<CustomernewEntity> findCustomerByCustomerNameContaining(String name);

	List<CustomernewEntity> findCustomerByCustomerNameContainingAndCustomerCode(String name, String custId);
 
}