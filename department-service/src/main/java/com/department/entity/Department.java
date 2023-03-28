package com.department.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {

	@Id
	@SequenceGenerator(name = "departments_id_gen", sequenceName = "departments_id_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "departments_id_gen")
	private Integer id;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
