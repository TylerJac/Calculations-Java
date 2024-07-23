import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        float num1_1 = (float)num1;
        float num2_2 = (float)num2;

        System.out.println((num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1_1 / num2_2));
        System.out.println("Modulus: " + (num1 % num2));

        scanner.close();
    }
}
