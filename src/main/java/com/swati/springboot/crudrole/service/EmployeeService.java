package com.swati.springboot.crudrole.service;

import java.util.List;

import com.swati.springboot.crudrole.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
