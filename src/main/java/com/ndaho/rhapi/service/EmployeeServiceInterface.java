package com.ndaho.rhapi.service;

import com.ndaho.rhapi.model.Employee;

import java.util.Optional;

public interface EmployeeServiceInterface {
    Iterable<Employee> getEmployees();

    void deleteEmployee(Long id);

    Optional<Employee> getEmployee(Long id);

    Employee saveEmployee(Employee employee);
}
