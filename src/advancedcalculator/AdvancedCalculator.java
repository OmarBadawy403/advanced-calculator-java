
package advancedcalculator;

import java.util.Scanner;


public class AdvancedCalculator {

  public  static void main(String[] args) {
      
      
       Scanner scanner = new Scanner(System.in);
        Advanced calculator = new Advanced();
        CalculatorHistory history = new CalculatorHistory();

        System.out.println("Welcome to the Advanced Calculator!");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Basic Operations (Add, Subtract, Multiply, Divide)");
            System.out.println("2. Advanced Operations (Square Root, Power)");
            System.out.println("3. View History");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter first number:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Enter second number:");
                    double num2 = scanner.nextDouble();

                    System.out.println("Choose operation: +, -, *, /");
                    char op = scanner.next().charAt(0);
                    double result = 0;

                    switch (op) {
                        case '+':
                            result = calculator.add(num1, num2);
                            break;
                        case '-':
                            result = calculator.subtract(num1, num2);
                            break;
                        case '*':
                            result = calculator.multiply(num1, num2);
                            break;
                        case '/':
                            result = calculator.divide(num1, num2);
                            break;
                        default:
                            System.out.println("Invalid operation!");
                            continue;
                    }

                    System.out.println("Result: " + result);
                    history.addHistory(num1 + " " + op + " " + num2 + " = " + result);
                    break;

                case 2:
                    System.out.println("Select advanced operation: 1. Square Root  2. Power");
                    int advChoice = scanner.nextInt();

                    if (advChoice == 1) {
                        System.out.println("Enter number:");
                        double number = scanner.nextDouble();
                        double sqrtResult = calculator.squareRoot(number);
                        System.out.println("Square Root: " + sqrtResult);
                        history.addHistory("sqrt(" + number + ") = " + sqrtResult);
                    } else if (advChoice == 2) {
                        System.out.println("Enter base:");
                        double base = scanner.nextDouble();
                        System.out.println("Enter exponent:");
                        double exponent = scanner.nextDouble();
                        double powerResult = calculator.power(base, exponent);
                        System.out.println("Power: " + powerResult);
                        history.addHistory(base + "^" + exponent + " = " + powerResult);
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 3:
                    System.out.println("Calculation History:");
                    history.printHistory();
                    break;

                case 4:
                    System.out.println("Exiting. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
      
      
      
      
    
  }
}
