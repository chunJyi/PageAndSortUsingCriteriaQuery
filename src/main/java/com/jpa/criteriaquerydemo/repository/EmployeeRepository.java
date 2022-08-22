package com.jpa.criteriaquerydemo.repository;

import com.jpa.criteriaquerydemo.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
