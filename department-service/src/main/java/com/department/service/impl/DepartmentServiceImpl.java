package com.department.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.entity.Department;
import com.department.repository.DepartmentRepository;
import com.department.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department save(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public Department update(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public Department findById(Integer id) {
		return departmentRepository.findById(id).get();
	}

	@Override
	public List<Department> findAll() {
		return departmentRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		departmentRepository.deleteById(id);
	}

}
