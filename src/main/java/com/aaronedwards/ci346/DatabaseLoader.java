package com.aaronedwards.ci346;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by aaron on 30/04/17.
 */

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeDataRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeDataRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employees("Akira", "Kurusu", "16:00",
                "21:00", "Afternoon"));
    }
}
