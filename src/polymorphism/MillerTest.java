package polymorphism;
import java.util.Scanner;

public class MillerTest {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		//Create an Array
        Millers[] millers = new Millers[15]; // Assumes 15 max millers to keep it simple.
        int millerAmt = 0; // Tracks the number of millers added.

		//Create loop to add new items to the array
        //Using a while loop here to allow the user to easily continue adding millers until they explicitly choose to exit the program.
        while (true) {
            System.out.println("Enter the type of miller you wishh to add: (1 - Employee, 2 - Supervisor, 3 - Consultant, 0 - Exit)");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                break; // exits the loop
            }

            System.out.println("Enter the miller's name:");
            String name = scanner.nextLine();
            //switch allows user to directly choose which class of miller they wish to add and can be easily updated for further types if need be. 
            switch (choice) {
                case 1: // employee miller
                    System.out.println("Enter the annual pay:");
                    double annualPay = scanner.nextDouble();
                    millers[millerAmt++] = new Employees(name, annualPay);
                    break;

                case 2: // supervisor miller
                    System.out.println("Enter the annual pay:");
                    double supAnnualPay = scanner.nextDouble();
                    System.out.println("Enter the bi-weekly bonus:");
                    double bonus = scanner.nextDouble();
                    millers[millerAmt++] = new Supervisors(name, supAnnualPay, bonus);
                    break;

                case 3: // consultant miller
                    System.out.println("Enter the hourly wage:");
                    double wage = scanner.nextDouble();
                    millers[millerAmt++] = new Consultants(name, wage);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
		
		//Output data (Printf not println)
        System.out.println("\nBi-Weekly Pay for Millers:");
        for (int i = 0; i < millerAmt; i++) {
            Millers miller = millers[i];
            System.out.printf("Name: %s, Bi-Weekly Pay: $%.2f%n", miller.getName(), miller.biWeeklyPay(80));
        }
        scanner.close();
	}
}
