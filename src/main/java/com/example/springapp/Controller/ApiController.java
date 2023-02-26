package com.example.springapp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.Employee;
import com.example.springapp.Repositories.EmployeeRepo;
import com.example.springapp.Service.ApiService;

@RestController
public class ApiController {
	@Autowired
	EmployeeRepo rep1;
	
	@Autowired
	ApiService ser;
	
	@GetMapping("/get")
	List<Employee> getList(){
		return rep1.findAll();
	}
	
	@PostMapping("/post")
	public Employee create (@RequestBody Employee a) {
		return rep1.save(a);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Employee> getbyid(@PathVariable int id){
		return ser.getStudent(id);
	}
	
}
