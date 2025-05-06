import java.util.Scanner;

public class Circle {
    double radius;
    String color;

    // Accept radius and color
    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter color: ");
        color = sc.nextLine();
    }

    // Calculate and display area
    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Color: " + color);
        System.out.println("Area of Circle: " + area);
    }
}
