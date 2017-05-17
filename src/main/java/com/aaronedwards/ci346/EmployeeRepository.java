package com.aaronedwards.ci346;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
/**
 * Created by aaron on 30/04/17.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long >{
    Optional<Employee> findByFirstName(String firstName);
}
