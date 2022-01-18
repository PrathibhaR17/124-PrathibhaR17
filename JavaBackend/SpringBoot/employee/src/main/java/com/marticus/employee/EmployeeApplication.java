package com.marticus.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.marticus.employee.vo.EmployeeVO;
import com.marticus.employee.vo.ProjectVO;
import com.marticus.employee.vo.TechnologyVO;


@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	@Bean
	public ProjectVO projectVO()
	{
		return new ProjectVO();
	}
	
	@Bean
	public TechnologyVO technologyVO()
	{
		return new TechnologyVO();
	}
	@Bean
	public EmployeeVO employeeVO()
	{
		return new EmployeeVO();
	}
	
}
