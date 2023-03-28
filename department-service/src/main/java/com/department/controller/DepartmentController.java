package com.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.entity.Department;
import com.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping
	public Department save(@RequestBody Department department) {
		return departmentService.save(department);
	}
	
	@PutMapping
	public Department update(@RequestBody Department department) {
		return departmentService.update(department);
	}
	
	@GetMapping
	public List<Department> findAll() {
		return departmentService.findAll();
	}
	
	@GetMapping("/{id}")
	public Department findById(@PathVariable("id") Integer id) {
		return departmentService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void save(@PathVariable("id") Integer id) {
		departmentService.deleteById(id);
	}
}
