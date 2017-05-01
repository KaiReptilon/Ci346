package com.aaronedwards.ci346;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by aaron on 30/04/17.
 */
@Data
@Entity
public class Employees {

    private @Id @GeneratedValue Long EmployeeId;

    private String employeeFirstName;
    private String employeeSurname;
    private String shiftStartTime;
    private String shiftFinishTime;
    private String shiftType;

    private Employees() {}

    public Employees(String firstName, String Surname, String Start, String Finish, String Type){

        this.employeeFirstName = firstName;
        this.employeeSurname = Surname;
        this.shiftStartTime = Start;
        this.shiftFinishTime = Finish;
        this.shiftType = Type;

    }


    public String getFirstName(){
        return this.employeeFirstName;
    }

    public String getSurname() {
        return this.employeeSurname;
    }

    public String getShiftStartTime() {
        return this.shiftStartTime;
    }

    public String getShiftFinishTime() {
        return this.shiftFinishTime;
    }

    public String getShiftType() {
        return this.shiftType;
    }
}






