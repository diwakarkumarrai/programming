import java.util.Scanner;

public class OddPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check Odd
        boolean isOdd = (num % 2 != 0);

        // Check Palindrome
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        boolean isPalindrome = (original == reversed);

        // Final Result
        if (isOdd && isPalindrome) {
            System.out.println("Number is Odd and Palindrome");
        } else if (isOdd) {
            System.out.println("Number is Odd but NOT Palindrome");
        } else if (isPalindrome) {
            System.out.println("Number is Palindrome but NOT Odd");
        } else {
            System.out.println("Number is neither Odd nor Palindrome");
        }

        sc.close();
    }
}