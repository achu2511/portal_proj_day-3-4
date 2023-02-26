package com.example.springapp.Service;

import java.util.Optional;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Models.Employee;
import com.example.springapp.Repositories.EmployeeRepo;


@Service
public class ApiService {
	@Autowired
	EmployeeRepo repo;
	
	public Optional<Employee> getStudent(int id){
		return repo.findById(id);
	}
	
}
