package org.example;

public class Manager extends Employee {
    private double bonus;

    public Manager(int employeeId, String employeeName, double salary, String position, double bonus) {
        super(employeeId, employeeName, position, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getAnnualSalary() {
        return super.getAnnualSalary() + this.bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}' + super.toString();
    }
}
