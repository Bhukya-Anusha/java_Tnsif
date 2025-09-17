package com.banusha.assignment.employees;

public class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(String name, int employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    // Getter & Setter
    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    // Overriding display
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}