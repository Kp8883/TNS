import com.krishna.assignment.employees.Manager;
import com.krishna.assignment.employees.Developer;
import com.krishna.assignment.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate usage of packages and access modifiers.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Creating Manager and Developer instances
        Manager manager = new Manager("Alice", 101, 80000, 5);
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        // Display info using utilities
        System.out.println("Manager Info:");
        EmployeeUtilities.displayEmployeeInfo(manager);
        EmployeeUtilities.applyBonus(manager, 10);

        System.out.println("\nDeveloper Info:");
        EmployeeUtilities.displayEmployeeInfo(developer);
        EmployeeUtilities.applyBonus(developer, 15);
    }
}
