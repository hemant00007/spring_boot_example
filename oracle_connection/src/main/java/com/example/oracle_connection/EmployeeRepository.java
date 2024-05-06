package com.example.oracle_connection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	

	Employee findByFirstName (String name);
}
