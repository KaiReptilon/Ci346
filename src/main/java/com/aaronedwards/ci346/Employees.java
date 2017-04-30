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

    private String EmployeeFirstName;
    private String EmployeeSurname;
    private String ShiftStartTime;
    private String ShiftFinishTime;
    private String ShiftType;

    private Employees() {}

    public Employees(String firstName, String Surname, String Start, String Finish, String Type){

        this.EmployeeFirstName = firstName;
        this.EmployeeSurname = Surname;
        this.ShiftStartTime = Start;
        this.ShiftFinishTime = Finish;
        this.ShiftType = Type;

    }


    public String getFirstName(){
        return this.EmployeeFirstName;
    }

    public String getSurname() {
        return this.EmployeeSurname;
    }

    public String getShiftStartTime() {
        return this.ShiftStartTime;
    }

    public String getShiftFinishTime() {
        return this.ShiftFinishTime;
    }

    public String getShiftType() {
        return this.ShiftType;
    }
}






