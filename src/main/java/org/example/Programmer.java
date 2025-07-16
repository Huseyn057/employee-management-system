package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmer extends Employee {
    private ArrayList<String> programmingLanguages;

    public Programmer(int employeeId, String employeeName, double salary, String... languages) {
        super(employeeId, employeeName, "Programmer", salary);
        this.programmingLanguages = new ArrayList<>();
        this.programmingLanguages.addAll(Arrays.asList(languages));
    }

    public void addSkill(String skill){
        this.programmingLanguages.add(skill);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLanguages=" + programmingLanguages +
                '}' + super.toString();
    }
}
