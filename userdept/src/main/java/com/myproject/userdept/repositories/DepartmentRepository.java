package com.myproject.userdept.repositories;

	import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.userdept.entities.Department;


	public interface DepartmentRepository extends JpaRepository<Department, Long>{

	}

