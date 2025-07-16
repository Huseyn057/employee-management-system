package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void giveRaiseToEmployee(int id, double percentage) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            double newSalary = employee.getSalary() * (1 + percentage / 100);
            employee.setSalary(newSalary);
            System.out.println("SUCCESS: " + employee.getEmployeeName() + "'s salary has been updated.");
        } else {
            System.out.println("ERROR: Employee with id " + id + " not found");
        }
    }

    public String generateDepartmentReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Department Report for: ").append(this.departmentName).append(" ---\n");
        for (Employee employee : employees) {
            sb.append(employee.toString()).append("\n");
        }
        sb.append("--- End of Report ---");
        return sb.toString();
    }
    public void printEmployeesByPosition() {
        System.out.println("\n--- Employees Grouped by Position ---");
        Set<String> positions = new HashSet<>();
        for (Employee emp : employees) {
            positions.add(emp.getPosition());
        }

        for (String position : positions) {
            System.out.println("Position: " + position);
            for (Employee employee : employees) {
                if (employee.getPosition().equals(position)) {
                    System.out.println("  - " + employee.getEmployeeName() + " (ID: " + employee.getEmployeeId() + ")");
                }
            }
        }
        System.out.println("-------------------------------------");
    }


}
