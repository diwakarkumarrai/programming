import java.util.Scanner;
/*
public class FactorialUsingRecursion {

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }

        scanner.close();
    }
}



 */
/*
class Palindrome {

    // Recursive function to reverse number
    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        int num = 222; // change number here

        int reversed = reverse(num, 0);

        if (num == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

 */
class Fibonacci {

    // Recursive function
    static int fib(int n) {
        // Base conditions
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 6; // number of terms

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}