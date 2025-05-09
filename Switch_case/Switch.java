package Switch_case;

import java.util.*;

public class Switch {

    static void addition(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    static void subtraction(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    static void multiplication(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    static void modulus(int a, int b) {
        System.out.println("Modulus = " + (a % b));
    }

    static void division(int a, int b) {
        if (b != 0) {
            System.out.println("Division = " + (a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String symbol;

        while (true) {
            System.out.println("\nEnter the two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Enter an operator (+, -, *, %, /):");
            symbol = sc.next();

            switch (symbol) {
                case "+":
                    addition(a, b);
                    break;
                case "-":
                    subtraction(a, b);
                    break;
                case "*":
                    multiplication(a, b);
                    break;
                case "%":
                    modulus(a, b);
                    break;
                case "/":
                    division(a, b);
                    break;
                default:
                    System.out.println("Invalid Operator");
            }

            System.out.println("Do you want to continue? (yes/no):");
            String cont = sc.next();
            if (!cont.equalsIgnoreCase("yes")) {
                break;
            }
        }

    }
}