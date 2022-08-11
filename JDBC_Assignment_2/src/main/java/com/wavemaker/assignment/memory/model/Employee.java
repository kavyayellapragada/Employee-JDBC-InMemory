package com.wavemaker.assignment.memory.model;
import com.wavemaker.assignment.memory.dao.EmployeeDAOImpl;
import java.util.*;
public class Employee {
    private String name;
    private int id;

    public Employee(int empId, String empname) {
        this.id =empId;
        this.name =empname;
    }
    public Employee() {
    }

    public Employee(Employee employee) {
    }

    public String toString(){
        return name +""+ id;
    }
    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id =id;
    }
    public void setName(String n){
        this.name =n;
    }

}
