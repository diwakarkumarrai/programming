

import java.util.Scanner;

/*

//write a code using method to print the facctoarial of a non negative number

public class prctise_question_on_method {
    static int factorial(int  n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n*factorial(n-1);




    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a non negative integer for factorial: ");
        int number = sc.nextInt();
        System.out.println(factorial(number));


    }

        }
 */



/*
//write a java code using method to print the multiplication table of a number

public class prctise_question_on_method {
    static void table(int n) {

        for (int i = 1; i < 11; i++) {

            System.out.println(n + " * " + i + " = " + (n * i));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number which you have to find the table");
         int number = sc.nextInt();
        table(number);
    }
}


 */




/*
//write a program using method to print the following pattern

//    *
//    * *
//    * * *
//    * * * *

public class prctise_question_on_method{
    static void printing_pattern(int i){
        for(int j=1;j<i;j++){
            for(int k=1;k<=j;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number that how much number of rows of star pattern you want to print: ");
        int number =sc.nextInt();
        printing_pattern(number);
    }
}

 */


/*

//wirte a recursive function to calculate the sum of first n natural number

public class prctise_question_on_method {
    static int sum(int n){
       int  result = 0;
        if(n==1){
            return 1;
        }
     return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number upto which you want the sum:  ");
        int number =sc.nextInt();
        System.out.println(sum(number));
    }
}


 */


/*

//write a function to print the following pattern

 // * * * *
 // * * *
 // * *
 // *


public class prctise_question_on_method {
    static void printing_pattern(int n){
        for (int i =1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row upto which you want to print the pattern");
        int number = sc.nextInt();
        printing_pattern(number);
    }
}



 */


/*

//Write a function to print nth term of fibonacci series using recursion
public class prctise_question_on_method {
    static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n==2) {
            return 1;

        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number which you fibonaccii term ");
        int number = sc.nextInt();
        System.out.println(fibonacci(number));
    }
    }


 */


//print this pattern using recursion

//* * * *
//* * *
//* *
//*


/*
public class prctise_question_on_method {
    static void  printing_star(int n){
        if(n>0){

            for(int i=1;i<=n;i++){
                System.out.print("*");
            }
            System.out.println();
            printing_star(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printing_star(n);
    }
}


 */


/*
//write a program to convert celcius to farenheit using method

public class prctise_question_on_method {
    static long temperature(long n){
long result = (long) ((n*1.8)+32);

        return result;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in degree Celciuis  to convert it into Farenheit");
        int cel = sc.nextInt();

        System.out.println(temperature(cel));
    }
}



 */


/*

//wirte a recursive function to calculate the sum of first n natural number


public class prctise_question_on_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which up to you want the sum");
        int number = sc.nextInt();
        int add = 0;
         for (int i = 1; i <= number; i++){
             add += i;
         }
        System.out.println("The sum up  to this number is "+add);
    }
}


 */











