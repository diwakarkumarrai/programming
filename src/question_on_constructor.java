/*
import java.util.Scanner;
class Employee{
    private String name;
    private float salary;
 public Employee(){
     name = "Diwakar";
     salary = 1984000.00f;
 }
 public Employee(String n,float b){
     name=n;
     salary = b ;
 }
 public Employee(float income){
     salary = income;
 }
 public String getname(){
     return name;
 }
 public float getsalary(){
     return salary;
 }

}
public class question_on_constructor {
    public static void main(String[] args) {
        Employee nitil =new Employee();
        Employee diwa =new Employee("Diwakar kumar rai",825447632);
        Employee kittu = new Employee(9874423.97f);
        System.out.println(nitil.getname());
        System.out.println(nitil.getsalary());

        System.out.println(diwa.getname());
        System.out.println(diwa.getsalary());

        System.out.println(kittu.getsalary());
        System.out.println(kittu.getname());

    }
}


 */
//guessing the random number taking through computer

import java.util.Scanner;
import java.util.Random;
class Mygamee {

    int number;
    int userinput;
    int guess = 0;

    public Mygamee() {
        Random rand = new Random();
        number = rand.nextInt(100) + 1;


    }

    public int getnumber() {
        System.out.println(number);
        return number;
    }

    public void gatenumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100: ");
        userinput = sc.nextInt();
        //return userinput;
    }

    public void iscorrect() {
        if (number == userinput) {
            System.out.println("number matched successfully");
            System.out.println("you guess the correct number after " + guess + " unsuccessful attempt");
        }
    }

    public void isnotcorrect() {
        if (number != userinput) {
            System.out.println("number matching Unsuccessful");
            guess++;
            System.out.println(guess + " unsuccessful try");
        }


    }
}

    public class question_on_constructor {
        public static void main(String[] args) {

            Mygamee game = new Mygamee();

            game.getnumber();
            while (game.number != game.userinput) {
                game.gatenumber();
                game.iscorrect();
                game.isnotcorrect();
            }
        }
    }






