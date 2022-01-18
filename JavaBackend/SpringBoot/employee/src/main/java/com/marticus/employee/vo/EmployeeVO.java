package com.marticus.employee.vo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeVO {

	String empName;
	String empId;
	String projectName;
	String technology;
}
