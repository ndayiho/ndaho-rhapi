package com.ndaho.rhapi.service;

import com.ndaho.rhapi.model.Employee;
import com.ndaho.rhapi.repository.EmployeeRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import lombok.Data;

import java.util.Optional;

@Data
@Service
public class EmployeeService implements EmployeeServiceInterface {

    @Autowired
    private EmployeeRepositoryInterface employeeRepository;

    public Optional<Employee> getEmployee(final Long id) {
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }

}
