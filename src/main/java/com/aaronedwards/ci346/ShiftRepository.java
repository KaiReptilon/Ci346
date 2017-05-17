package com.aaronedwards.ci346;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;


/**
 * Created by aaron on 02/05/17.
 */
public interface ShiftRepository extends JpaRepository<Shift, Long> {
    Collection<Shift> findByEmployeeFirstName(String firstName);
}
