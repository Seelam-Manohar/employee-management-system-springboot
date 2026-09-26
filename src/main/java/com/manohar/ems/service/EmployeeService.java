package com.manohar.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.manohar.ems.entity.Employee;
import com.manohar.ems.exception.EmployeeNotFoundException;
import com.manohar.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // CREATE
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // GET ALL
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // GET BY ID
    public Employee getEmployeeById(Long id) {

        return employeeRepository.findById(id)
                .orElseThrow(() ->
                    new EmployeeNotFoundException(
                        "Employee not found with id: " + id
                    )
                );
    }

    // GET BY DEPARTMENT
    public List<Employee> getEmployeesByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }

    // UPDATE
    public Employee updateEmployee(Long id, Employee employee) {

        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() ->
                    new EmployeeNotFoundException(
                        "Employee not found with id: " + id
                    )
                );

        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setSalary(employee.getSalary());
        existingEmployee.setDepartment(employee.getDepartment());

        return employeeRepository.save(existingEmployee);
    }

    // DELETE
    public void deleteEmployee(Long id) {

        if (!employeeRepository.existsById(id)) {

            throw new EmployeeNotFoundException(
                "Employee not found with id: " + id
            );
        }

        employeeRepository.deleteById(id);
    }
}