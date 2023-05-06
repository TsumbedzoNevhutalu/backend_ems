package com.employee.employee.systems.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employee.systems.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    // Employee update(Employee employee);
    //connect model and controller through the extension jpa and also to connect to the database

    
}
    

//create controller that contains routes
    

