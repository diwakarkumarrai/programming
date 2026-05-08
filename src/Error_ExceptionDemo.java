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

/*
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

 */



/*
// Handling specific exception in java
public class Error_ExceptionDemo {
    public static void main(String[] args) {
        int[] marks = {56, 79, 87};

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();

        System.out.println("Enter the number through you want to divide the value at the chosen array index: ");
        int number = sc.nextInt();

        try{
            System.out.println("You have chosen the array index "+ind+" and the value on this index is "+marks[ind]);
            System.out.println("The value of array-value/number is: "+ marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("Some Exception is occurred:");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Some Exception is occured:");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some Exception occurred:");
            System.out.println(e);
        }
        finally {
            System.out.println("You can restart the game and give correct input! if exception is occurred");
        }

        System.out.println("End of the program!!!");

    }
}

 */


/*
//Nested try - catch block
public class Error_ExceptionDemo {
    public static void main(String[] args) {
        int[] marks = {30, 40, 50};
        java.util.Scanner sc = new java.util.Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the index number: ");
            int ind = sc.nextInt();

            try{
                System.out.println("Now we are checking that the entered index value is in array bound or not: ");
                try{
                    System.out.println(marks[ind]);
                    System.out.println("This index is in array bound and the value at this index is written above.");
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index is out of bound");
                    System.out.println("Exception in level 2");
                }
            }
            catch (Exception e){
                System.out.println("Exception in level 1");
            }
        }
    }
}

 */


class My_Exception extends Exception{
    My_Exception(String message){
        super(message);
    }
    @Override
    public String toString(){
        return "OhhNo!: "+ super.getMessage();
    }
    public String getMessage(){
        return "Error: "+ super.getMessage();
    }


}

public class Error_ExceptionDemo {
    static void CheckAge(int age) throws My_Exception{
        if (age < 18) {
            throw new My_Exception("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to Vote");
        }
    }


    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try {
            CheckAge(age);
        } catch (My_Exception e) {
            System.out.println(e);// This is from toString class
           System.out.println(e.getMessage());// This is from getMessage class
           e.printStackTrace();// This give detailed information about error
        }
    }
}