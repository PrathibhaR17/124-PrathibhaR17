package com.marticus.employee.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.employee.entity.EmployeeEntity;


@Repository
public interface EmployeeRepo  extends JpaRepository<EmployeeEntity, Integer>{

	EmployeeEntity findEmployeeById(int id);

	EmployeeEntity findEmployeeByEmpId(int empId);

	EmployeeEntity findEmployeeByProjectId(int id);

}

