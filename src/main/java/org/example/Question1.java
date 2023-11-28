package org.example;


import org.example.model.Employee;
import org.example.utili.EmployeeRepo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Get the list of Employee and group the employees by citi names.
 */

public class Question1 {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeRepo.getEmployee();

        Map<String, List<Employee>> employeeListGroupedByCity = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getCity));

        employeeListGroupedByCity.forEach(
                (s, employees) -> {
                    System.out.println("City: " + s + " || " + " Employee List: "+ employees);
                }
        );

    }
}
