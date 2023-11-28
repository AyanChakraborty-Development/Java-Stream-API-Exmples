package org.example;

import org.example.model.Employee;
import org.example.utili.EmployeeRepo;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

/**
 * Print the list of unique lastNames of Employees in each city.
 * use EmployeeRepo
 */
public class Question5 {

    public static void main(String[] args) {

        Map<String, Set<String>> setMap = EmployeeRepo.getEmployee()
                .stream()
                .collect(Collectors.groupingBy(Employee::getCity, mapping(Employee::getLastName, toSet())));

        System.out.println(setMap);
    }
}
