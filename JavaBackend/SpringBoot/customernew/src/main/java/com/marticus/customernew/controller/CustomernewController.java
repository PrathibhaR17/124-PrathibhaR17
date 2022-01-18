package com.marticus.customernew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.customernew.entity.CustomernewEntity;
import com.marticus.customernew.service.CustomernewService;



@RestController
@RequestMapping("/customer")
public class CustomernewController {
	
	@Autowired
	CustomernewService customerService;
	
	@PostMapping("/")
	public ResponseEntity<Void>saveCustomer(@RequestBody CustomernewEntity customerEntity)
	{
		
		customerService.saveCustomer(customerEntity);
		return ResponseEntity.status(HttpStatus.CREATED).header("Records", "Created").build();
	}

	@GetMapping("/{id}")
	public ResponseEntity<CustomernewEntity> getCustomerById(@PathVariable("id") int id)
	{
		CustomernewEntity customerEntity = customerService.findCustomerById(id);
		return ResponseEntity.ok(customerEntity);
	}
	
	
	@GetMapping("/")
	public ResponseEntity<List<CustomernewEntity>> getCustomerAll()
	{
		List<CustomernewEntity> customerEntity1= customerService.findAllCustomers();
		return ResponseEntity.ok(customerEntity1);
	}
	
	@DeleteMapping("/{id}")
	
		public ResponseEntity<String> deleteCustomerById(@PathVariable("id") Long id){
		String body="Record deleted Successfully";
		Boolean delStatus=customerService.deleteCustomerById(id);
		if(!delStatus)
		{
			body ="could not delete the record";
			
		}
			return ResponseEntity.ok().body(body);
	}
	

	@PutMapping("/")
	public ResponseEntity<CustomernewEntity> update(@RequestBody CustomernewEntity customerEntity)
	{
		
		CustomernewEntity cust= customerService.update(customerEntity);
		return ResponseEntity.ok(cust);
		
	}
	
	@GetMapping("/fetch/{name}")
	public ResponseEntity<List<CustomernewEntity>> getCustomerByName(@PathVariable String name)
	{
		List<CustomernewEntity> customerEntity= customerService.findCustomerByName(name);
		return ResponseEntity.ok(customerEntity);
	}
	
	
	@GetMapping("/fetchp/{name}")
	public ResponseEntity<List<CustomernewEntity>> getCustomerByNameLike(@PathVariable String name)
	{
		List<CustomernewEntity> customerEntity= customerService.findCustomerByNameLike(name);
		return ResponseEntity.ok(customerEntity);
	}
	
	@GetMapping("/fetchp/{name}/{custid}")
	public ResponseEntity<List<CustomernewEntity>> getCustomerByNameLike(@PathVariable String name,@PathVariable String custid)
	{
		List<CustomernewEntity> customerEntity= customerService.findCustomerByNameAndCustomerId(name,custid);
		return ResponseEntity.ok(customerEntity);
	}
	
	
//	@PostMapping("/login/{username}/{password}")
//	public ResponseEntity<String> login(@PathVariable("login") String userName,
//			@PathVariable("password")  String password)
//	{
//		 
//		//String str=getToken();
//		
//		
//		
//		
//		return ResponseEntity.ok(strs);
//	}
//	
//	@GetMapping("/login/{username}/{pwd}")
//	public ResponseEntity<String> login(@PathVariable String username, 
//			@PathVariable String pwd)
//	{
//		 
//		String str=getJWTToken();
//		
//		
//		
//		return ResponseEntity.ok(str);
//	}
//
//private String getJWTToken() {
//	// TODO Auto-generated method stub
//	return null;
//}
}
