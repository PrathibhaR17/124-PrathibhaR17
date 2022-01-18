package com.marticus.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.department.entity.DepartmentEntity;
import com.marticus.department.repo.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	public void saveCustomer(DepartmentEntity departmentEnt) {
		
		
		departmentRepository.save(departmentEnt);
	}
	
	public DepartmentEntity findDepartmentById(long id)
	{
		return departmentRepository.findDepartmentById(id);
		// return departmentRepository.findDepartmentRepositoryById(id);
	}


	public DepartmentEntity findDepartmentByDepartmentName(String departmentName) {
		// TODO Auto-generated method stub
		return departmentRepository.findDepartmentByDepartmentName(departmentName);
	}



public List<DepartmentEntity> findAllDepartments() {
	// TODO Auto-generated method stub
	return departmentRepository.findAll();
}


public Boolean deleteDepartmentById(long id) {
	// TODO Auto-generated method stub
	DepartmentEntity dept=departmentRepository.findDepartmentById(id);
	if(dept!=null)
	{
		departmentRepository.delete(dept);
		return true;
	}
	return false;
}


public void updateDepartment (DepartmentEntity dept) {
	// TODO Auto-generated method stub
	DepartmentEntity deptDB=departmentRepository.findDepartmentById(dept.getId());
	deptDB.setDepartmentCode(dept.getDepartmentCode());
	deptDB.setDepartmentName(dept.getDepartmentName());
	departmentRepository.save(deptDB);

}

public void saveDepartment(DepartmentEntity departmentEntity) {
	// TODO Auto-generated method stub
	departmentRepository.save(departmentEntity);
}
}
