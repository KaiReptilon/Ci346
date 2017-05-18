package com.aaronedwards.ci346;

import lombok.Data;
import javax.persistence.*;

/**
 * Created by aaron on 30/04/17.
 */

@Data
@Entity
public class Employee {

    private @Id @GeneratedValue Long EmployeeId;
    private String FirstName;
    private String Surname;
    private String description;

    private Employee(){}

    public Employee(String FirstName, String Surname, String description){
        this.FirstName = FirstName;
        this.Surname = Surname;
        this.description = description;
    }

    /*public Long getEmployeeId() {
        return EmployeeId;
    }*/

    /*public void setShift(ShiftManager shiftManager){
        this.shiftManager = shiftManager;
    }*/

}






