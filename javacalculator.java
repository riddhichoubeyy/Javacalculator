package pack2;

import java.util.Scanner;

public class javacalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Basic Java Calculator ===");
        System.out.println("Available operations: +, -, *, /");
        System.out.println("Enter 'exit' to quit the calculator");
        
        while (true) {
            try {
                System.out.print("\nEnter first number: ");
                String input1 = scanner.nextLine();
                
                if (input1.equalsIgnoreCase("exit")) {
                    break;
                }
                
                System.out.print("Enter operator (+, -, *, /): ");
                String operator = scanner.nextLine();
                
                if (operator.equalsIgnoreCase("exit")) {
                    break;
                }
                
                System.out.print("Enter second number: ");
                String input2 = scanner.nextLine();
                
                if (input2.equalsIgnoreCase("exit")) {
                    break;
                }
                
                // Convert inputs to numbers
                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);
                double result;
                
                // Perform calculation based on operator
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case "-":
                        result = num1 - num2;
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case "*":
                        result = num1 * num2;
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed!");
                            continue;
                        }
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        break;
                    default:
                        System.out.println("Error: Invalid operator! Please use +, -, *, or /");
                        continue;
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter valid numbers!");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
        
        System.out.println("\nThank you for using Java Calculator!");
        scanner.close();
    }
}