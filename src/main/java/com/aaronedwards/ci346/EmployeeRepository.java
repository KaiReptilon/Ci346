package com.aaronedwards.ci346;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
/**
 * Created by aaron on 30/04/17.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long >{

}
