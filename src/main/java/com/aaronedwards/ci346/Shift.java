package com.aaronedwards.ci346;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by aaron on 02/05/17.
 */

@Entity
public class Shift {

    @JsonIgnore
    @ManyToOne
    private Employee employee;

    @Id
    @GeneratedValue
    private Long EmployeeId;

    Shift() { //jpa only
    }

    public Shift (Employee employee, String day, String time) {
        this.day = day;
        this.time = time;
        this.employee = employee;
    }

    public String day;
    public String time;

    public Employee getEmployee() {
        return employee;
    }

    public Long getEmployeeId() {
        return EmployeeId;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }
}
