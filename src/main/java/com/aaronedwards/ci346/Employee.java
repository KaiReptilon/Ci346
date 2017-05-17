package com.aaronedwards.ci346;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by aaron on 30/04/17.
 */

@Entity
public class Employee {

    @OneToMany(mappedBy = "employee")
    private Set<Shift> shifts = new HashSet<>();

    @Id
    @GeneratedValue
    private Long EmployeeId;

    private String employeeFirstName;
    private String employeeSurname;

    public Employee(Long employeeId, String firstName, String Surname){

        this.EmployeeId = employeeId;
        this.employeeFirstName = firstName;
        this.employeeSurname = Surname;
    }

    public Long getEmployeeId() {return this.EmployeeId; }

    public String getFirstName(){
        return this.employeeFirstName;
    }

    public String getSurname() {
        return this.employeeSurname;
    }

    @JsonIgnore
    public String firstName;
    public String surname;

    public Employee(String firstName, String surname){
        this.employeeFirstName = firstName;
        this.employeeSurname = surname;
    }

    Employee(){//jpa only
    }

}






