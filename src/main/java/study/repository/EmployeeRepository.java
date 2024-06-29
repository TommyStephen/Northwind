package study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import study.model.Employees;

public interface EmployeeRepository extends 
JpaRepository<Employees, Integer>, JpaSpecificationExecutor<Employees> {

	
}
