import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user input
        System.out.println("Enter your full name with initial:");
        String name = scanner.nextLine();

        System.out.println("Enter your roll number:");
        String rollNumber = scanner.nextLine();

        System.out.println("Enter your grade:");
        String grade = scanner.nextLine();

        System.out.println("Enter your percentage:");
        String percentage = scanner.nextLine();

        // Display output
        System.out.println("\nOutput:");
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println("\t" + grade);
        System.out.println("\t\t" + percentage);

        scanner.close();
    }
}
