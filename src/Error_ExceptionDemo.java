//import java.util.Scanner;
/*
public class Error_ExceptionDemo {
    public static void main(String[] args) {
        // SYNTAX ERROR
        // int a = 10 // Error : No Semi-colon
        // b = 10; // b is not declared

        // LOGICAL ERROR
        // Print all prime number between 1 and 10
        System.out.println(2);
        for(int i = 1; i<5; i++){
            System.out.println(2*i+1); // This will give 9 which is not prime , so here is logical error
        }

        // RUNTIME ERROR ---> Also called Exception!
        int k;
        java.util.Scanner sc =  new java.util.Scanner(System.in);
        k =sc.nextInt();
        System.out.println("The answer when we divide 1000 by "+k+" is " + 1000/k);
        //this will throw error when we input anything else at place of integer

    }
}


 */


//using try and catch block to handle exception
public class Error_ExceptionDemo{
    public static void main(String[] args) {
       int a = 1000;
       int b = 0;

       //without try - catch block --> this will throw error and program execution will stop here.
          // int c =a/b;
          // System.out.println("The result of division of a/b is "+c);

       //with try - catch block
       try{
           int c = a/b;
           System.out.println("The result of a/b is "+c);
       } catch (Exception e) {
           System.out.println("This code is not running. Reason is: ");
           System.out.println(e);
       }

        System.out.println("End of the program");
    }
}