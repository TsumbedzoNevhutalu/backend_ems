package com.employee.employee.systems.controller;

import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.World;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.systems.models.Employee;
import com.employee.employee.systems.repo.EmployeeRepo;

import io.micrometer.common.lang.NonNull;

//add rest since we calling this library to use in application
@RestController
@RequestMapping(value="/employees")//specify end point what u want to display

public class EmployeeController {
    //call the repo to connect the model and the controller
    @Autowired 
    private EmployeeRepo employeeRepo;


    //request a method  with all information including objects
    @GetMapping 
    public List<Employee> getEmployees()  {
        //call the model employee//
        return  employeeRepo.findAll(); //getting data from employee repo
    
}
//get employee calling by calling an employee specifically by id
@GetMapping(value="/{empId}")
public Optional<Employee> findOne(@PathVariable int empId){
    System.out.println("hello wolrld");
    return employeeRepo.findById(empId);
}


@PostMapping
//creating employee data and a body to request data. the method must return data from the input
public Employee save(@Validated @NonNull @RequestBody Employee employee){
    return employeeRepo.save(employee); //return data from the employee repo

}

//to update
@PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id,@RequestBody Employee employeeDetails) {
        Employee updateEmployee = employeeRepo.findById((int) id)
                .orElseThrow();

        updateEmployee.setFirstName(employeeDetails.getFirstName());
        updateEmployee.setLastName(employeeDetails.getLastName());
        updateEmployee.setEmail(employeeDetails.getEmail());
        updateEmployee.setDepartment(employeeDetails.getDepartment());

        employeeRepo.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id){
        employeeRepo.deleteById(id);
        return new ResponseEntity<String>("Employee deleted", HttpStatus.OK);
    }

}

