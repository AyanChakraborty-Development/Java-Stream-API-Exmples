package org.example.utili;

import org.example.model.Employee;

import java.util.List;

public class EmployeeRepo {

    public static List<Employee> getEmployee(){

        return List.of(
                new Employee("Ayan","Chakraborty", "Uttarpara", 1),
                new Employee("Shanti", "Shamanta", "Tamluk", 2),
                new Employee("Tatai", "Chakraborty", "Uttarpara", 3),
                new Employee("Borsha", "Shamanta", "Tamluk", 4),
                new Employee("Nayan","Chakraborty", "Uttarpara", 1),
                new Employee("Nishanti", "Shamanta", "Tamluk", 2),
                new Employee("Latai", "Chakraborty", "Uttarpara", 3),
                new Employee("Torsha", "Shamanta", "Tamluk", 4)

        );
    }
}
