package com.jpa.criteriaquerydemo.service;

import com.jpa.criteriaquerydemo.model.Employee;
import com.jpa.criteriaquerydemo.model.EmployeePage;
import com.jpa.criteriaquerydemo.model.EmployeeSearchCriteria;
import com.jpa.criteriaquerydemo.repository.EmployeeCriteriaRepository;
import com.jpa.criteriaquerydemo.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeCriteriaRepository employeeCriteriaRepository;

    public EmployeeService(EmployeeRepository employeeRepository,
                           EmployeeCriteriaRepository employeeCriteriaRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeCriteriaRepository = employeeCriteriaRepository;
    }

    public Page<Employee> getEmployees(EmployeePage employeePage,
                                       EmployeeSearchCriteria employeeSearchCriteria){
        return employeeCriteriaRepository.findAllWithFilters(employeePage, employeeSearchCriteria);
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
