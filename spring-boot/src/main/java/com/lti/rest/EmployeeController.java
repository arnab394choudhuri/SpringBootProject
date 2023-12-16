package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Employee;
import com.lti.repo.BaseResponse;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	Employee emp;
	
	private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    
    @PostMapping(value="/add",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addFlight(@RequestBody Employee emp)
	{
           new Employee(emp.getId(),emp.getName());
          BaseResponse response= new BaseResponse();
          System.out.println("Employee Created");
          response.setStatus(SUCCESS_STATUS);
          
	}
	
	@GetMapping(value="/byId/{id}",produces = "application/json")
	public BaseResponse validate(@PathVariable String id)
	{
		
		BaseResponse response= new BaseResponse();
		if (emp.getId().equals(id))
		{
			 response.setStatus(SUCCESS_STATUS);
		}
		else
		{
			response.setStatus(ERROR_STATUS);
		}
		
		return response;
	}
}
