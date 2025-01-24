import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        String firstInput = scanner.nextLine();
        int num1 = Integer.parseInt(firstInput);

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        String secondInput = scanner.nextLine();
        int num2 = Integer.parseInt(secondInput);

        // Perform calculations
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2; // Assuming num2 is not zero for simplicity

        // Display the results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        scanner.close();
    }
}
