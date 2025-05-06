import java.util.Scanner;

public class Commission {
    String name, address, phone;
    double salesAmount;

    // Accept details
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    // Calculate and display commission
    public void calculateCommission() {
        double commission;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("Commission: " + commission);
    }
}
