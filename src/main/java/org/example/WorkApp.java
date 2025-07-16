package org.example;

public class WorkApp {
    public static void main(String[] args) {
        Department techDepartment = new Department("Technology");

        Manager manager = new Manager(101, "Alice Johnson", 15000,"fdf" , 455);
        Programmer prog1 = new Programmer(201, "Bob Smith", 75000, "Java", "Python");
        Programmer prog2 = new Programmer(202, "Charlie Brown", 80000, "JavaScript", "React");
        Employee qaEngineer = new Employee(301, "Diana Prince", "QA Engineer", 342);

        techDepartment.addEmployee(manager);
        techDepartment.addEmployee(prog1);
        techDepartment.addEmployee(prog2);
        techDepartment.addEmployee(qaEngineer);

        System.out.println("\n" + techDepartment.generateDepartmentReport());

        System.out.println("\n--- Performing Salary Update ---");
        techDepartment.giveRaiseToEmployee(202, 10);
        techDepartment.giveRaiseToEmployee(999, 5);

        prog1.addSkill("SQL");
        System.out.println("INFO: Added new skill to " + prog1.getEmployeeName());
        System.out.println("\n--- Updated Department Report ---");
        System.out.println(techDepartment.generateDepartmentReport());
        techDepartment.printEmployeesByPosition();
    }
}