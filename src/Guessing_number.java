import java.util.Random;
import java.util.Scanner;
class Game {
    int number1;
    int count=0;
    int number2;
   public Game(){
       Random rand = new Random();
       number1  = rand.nextInt(100);

   }

   public void take_user_input(){
       System.out.println("Guess the number");
       Scanner sc = new Scanner(System.in);
       number2 = sc.nextInt();
   }

  public boolean isCorrectNumber(){
       count++;
       if(number1==number2){
           System.out.println("Number matched");
           System.out.println("It takes "+count+" attempt to be found");
           return true;

       }
       else if (number1<number2){
           System.out.println("Entered number is greater , plz enter the number less than "+number2);

       }
       else if(number1>number2){
           System.out.println("Entered number is lesser , plz enter the number greater than "+number2);

       }

           return false;
       }

}
public class Guessing_number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean z= false;
        while(!z){
            g.take_user_input();
           z= g.isCorrectNumber();

        }
    }

}


