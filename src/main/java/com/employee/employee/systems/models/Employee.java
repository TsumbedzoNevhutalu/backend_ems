package com.employee.employee.systems.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name="Emp_management_sys")
public class Employee {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empid")
    private int empId;

    @Column(name = "Name")
    private String firstName;

    @Column(name = "Surname")
    private String lastName;

    @Column(name = "Emails")
    private String email;

    @Column(name = "Department")
    private String dpt;

    @Column(name = "Cellphone")
    private String cell;

    @Column(name = "Address")
    private String address;

    @Column(name = "Salary")
    private Integer salary;

    @Column(name = "Gender")
    private String gender;




    public Employee(){
        
    }

    // constructor to initialize variables
    public Employee(int empId, String firstName, String lastName, String email, String department, String cell, String address, Integer salary, String gender) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dpt = department;
        this.cell =cell;
        this.address=address;
        this.salary=salary;
        this.gender=gender;
        //this.contactNo = contactNo;
    }
    // ID is called at the Repo hence @ID is used to call that id from the repo
    @Id
    @GeneratedValue
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return dpt;

    }

    public void setDepartment(String department) {
        this.dpt = department;
    }

    public String getCellphone() {
        return cell;

    }

    public void setCellphone(String cell) {
        this.cell = cell;
    }

    public String getAddress() {
        return address;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSalary() {
        return salary;

    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;

    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // //public String getContactNo() {
    //     return contactNo;
    // }

    // public void setContactNo(String contactNo) {
    //     this.contactNo = contactNo;
    // }
}




    

