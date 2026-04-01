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

/*
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

 */
/*
class MaxInArray {

    // Recursive function to find maximum
    static int findMax(int[] arr, int n) {
        // Base condition
        if (n == 1) {
            return arr[0];
        }

        // Recursive call
        int maxOfRest = findMax(arr, n - 1);

        // Compare last element with max of remaining
        return Math.max(arr[n - 1], maxOfRest);
    }

    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 67, 12};

        int max = findMax(arr, arr.length);

        System.out.println("Greatest element: " + max);
    }
}

 */

/*
class PalindromeCheck {

    static boolean isPalindrome(String str, int start, int end) {
        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

 */
/*

class TowerOfHanoi {

    static void hanoi(int n, char source, char helper, char destination) {
        // Base condition
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from source → helper
        hanoi(n - 1, source, destination, helper);

        // Step 2: Move nth disk from source → destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from helper → destination
        hanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'B', 'C');
    }
}

 */




