package com.department.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.department.entity.Department;

public interface DepartmentService {
	
	public Department save(Department user);
	
	public Department update(Department user);
	
	public Department findById(Integer id);
	
	public List<Department> findAll();
	
	public void deleteById(Integer id);
}
