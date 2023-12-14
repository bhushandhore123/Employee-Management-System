package com.springbootTutorial.Employee.services;

import com.springbootTutorial.Employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);


    Employee getEmployeeById(Long id, Employee employee);

    Employee updateEmployee(Long id, Employee employee);

    Employee getEmployeeById(Long id);
}
