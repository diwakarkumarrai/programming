public class Calculator {
    // Instance variables
    private double result;
    private String lastOperation;

    // Constructor
    public Calculator() {
        this.result = 0.0;
        this.lastOperation = "None";
    }

    // Basic arithmetic operations
    public double add(double a, double b) {
        result = a + b;
        lastOperation = "Addition";
        return result;
    }

    public double subtract(double a, double b) {
        result = a - b;
        lastOperation = "Subtraction";
        return result;
    }

    public double multiply(double a, double b) {
        result = a * b;
        lastOperation = "Multiplication";
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        result = a / b;
        lastOperation = "Division";
        return result;
    }

    public double power(double base, double exponent) {
        result = Math.pow(base, exponent);
        lastOperation = "Power";
        return result;
    }

    public double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot calculate square root of negative number!");
        }
        result = Math.sqrt(a);
        lastOperation = "Square Root";
        return result;
    }

    // Getter methods
    public double getResult() {
        return result;
    }

    public String getLastOperation() {
        return lastOperation;
    }

    // Reset calculator
    public void reset() {
        result = 0.0;
        lastOperation = "None";
        System.out.println("Calculator reset to zero.");
    }

    // Display result
    public void displayResult() {
        System.out.println("Current result: " + result);
        System.out.println("Last operation: " + lastOperation);
    }

    // ========== MAIN METHOD ==========
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("=====================================");
        System.out.println("     WELCOME TO CALCULATOR APP");
        System.out.println("=====================================");

        // Demo of all operations
        System.out.println("\n--- DEMONSTRATING CALCULATOR OPERATIONS ---");

        System.out.println("\n1. Addition: 15.5 + 20.3 = " + calc.add(15.5, 20.3));
        calc.displayResult();

        System.out.println("\n2. Subtraction: 50 - 25.5 = " + calc.subtract(50, 25.5));
        calc.displayResult();

        System.out.println("\n3. Multiplication: 8 * 7 = " + calc.multiply(8, 7));
        calc.displayResult();

        System.out.println("\n4. Division: 100 / 4 = " + calc.divide(100, 4));
        calc.displayResult();

        System.out.println("\n5. Power: 5^3 = " + calc.power(5, 3));
        calc.displayResult();

        System.out.println("\n6. Square Root: √64 = " + calc.squareRoot(64));
        calc.displayResult();

        // Interactive menu
        System.out.println("\n=====================================");
        System.out.println("       INTERACTIVE CALCULATOR");
        System.out.println("=====================================");

        boolean running = true;

        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add two numbers");
            System.out.println("2. Subtract two numbers");
            System.out.println("3. Multiply two numbers");
            System.out.println("4. Divide two numbers");
            System.out.println("5. Calculate power");
            System.out.println("6. Calculate square root");
            System.out.println("7. View current result");
            System.out.println("8. View last operation");
            System.out.println("9. Reset calculator");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Result: " + calc.add(num1, num2));
                    calc.displayResult();
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calc.subtract(num1, num2));
                    calc.displayResult();
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calc.multiply(num1, num2));
                    calc.displayResult();
                    break;

                case 4:
                    System.out.print("Enter numerator: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter denominator: ");
                    num2 = scanner.nextDouble();
                    try {
                        System.out.println("Result: " + calc.divide(num1, num2));
                        calc.displayResult();
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calc.power(num1, num2));
                    calc.displayResult();
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    try {
                        System.out.println("Result: " + calc.squareRoot(num1));
                        calc.displayResult();
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 7:
                    System.out.println("Current result: " + calc.getResult());
                    break;

                case 8:
                    System.out.println("Last operation: " + calc.getLastOperation());
                    break;

                case 9:
                    calc.reset();
                    break;

                case 0:
                    running = false;
                    System.out.println("\nThank you for using the calculator!");
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 0 and 9.");
            }
        }

        scanner.close();
    }
}