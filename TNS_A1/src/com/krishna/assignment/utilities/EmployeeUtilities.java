package com.krishna.assignment.utilities;

import com.krishna.assignment.employees.Employee;

/**
 * Utility class for operations on Employee objects.
 */
public class EmployeeUtilities {

    /**
     * Prints basic info about an employee.
     * @param employee The employee to be displayed.
     */
    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
    }

    /**
     * Applies a bonus to the employee's salary.
     * @param employee The employee to whom bonus is applied.
     * @param bonus Percentage bonus to apply.
     */
    public static void applyBonus(Employee employee, double bonus) {
        double newSalary = employee.getSalary() + (employee.getSalary() * bonus / 100);
        employee.setSalary(newSalary);
        System.out.println("Bonus applied! New Salary: $" + newSalary);
    }
}
