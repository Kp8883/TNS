package com.krishna.assignment.employees;

/**
 * Represents a Manager, extending the Employee class.
 */
public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
