package com.swati.springboot.crudrole.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swati.springboot.crudrole.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

   

}
