import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to find the factorial");
        int x = sc.nextInt();
        int fact = 1;
        for (int i = 1; i<=x;i++){
            fact = (fact * i);
        }
        System.out.println(fact);
        System.out.println();
        System.out.println("------By using while loop------");
        System.out.println();
         int i =1;
         int factorial = 1;
        while (i<=x){
            factorial =(factorial*i);
            i++;
        }
        System.out.println(factorial);
    }
}
