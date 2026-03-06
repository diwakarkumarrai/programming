import java.util.Scanner;
import java.util.Random;
public class rockpaperscissor {
    public static void main(String[] args) {
        int humanscore = 0;
        int computerscore = 0;
        System.out.println("-------hello! Welcome to game-------");
        for (int i = 1; i <= 5;i++) {
            System.out.println("enter 1 for rock , enter 2 for paper , Enter 3 for scissor ");
            Scanner sc = new Scanner(System.in);
            int human = sc.nextInt();
            switch (human) {
                case 1:
                    System.out.println("you have choosed rock");
                    break;
                case 2:
                    System.out.println("you have choosed paper");
                    break;
                case 3:
                    System.out.println("you have choosed scissor");
                    break;
                default:
                    System.out.println("invalid choice");


            }

            int min = 1;
            int max = 3;
            Random rand = new Random();
            int computer = rand.nextInt(max - min + 1) + min;  // 1 to 100
            if (human == 1 || human == 2 || human == 3) {
                //System.out.println("Random number --> " + computer);

                switch (computer) {
                    case 1:
                        System.out.println("computer has choosed rock");
                        break;
                    case 2:
                        System.out.println("computer has choosed paper");
                        break;
                    case 3:
                        System.out.println("computer has choosed scissors");
                        break;
                }
                if (human == computer) {
                    System.out.println("game draw");
                    System.out.println("replay the game");
                }
                if (human == 1 && computer == 2 || human == 2 && computer == 3 || human == 3 && computer == 1) {
                    System.out.println("computer won this game");
                    computerscore++;
                }
                if (human == 1 && computer == 3 || human == 2 && computer == 1 || human == 3 && computer == 2) {
                    System.out.println("you have won the game");
                    humanscore++;
                }

                System.out.println();
            }
        }
        System.out.println("---------Final Result---------");
        System.out.println("you have won the game "+humanscore+" time");
        System.out.println("computer have won the game "+computerscore+" time");
        System.out.println();
            if(humanscore == computerscore){
                System.out.println("overall match draw");
            }
            if (humanscore > computerscore) {
                System.out.println("overall you have won this game");
            }
            if (humanscore < computerscore){
                System.out.println("overall computer have won this code");
            }






        }
}