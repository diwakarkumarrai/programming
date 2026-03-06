import java.util.Scanner;


public class printingstarpattern {
    public static void main(String[] args) {

        for(int i = 5; i>=1;i--){

            for (int k = 1; k<=(5-i);k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++) {

                System.out.print("*");
            }
            System.out.println();
            }
        System.out.println();

        System.out.println("------By using while loop------");
        int i = 5;
        int j = 1;

        while (i>=1){
            while(j<=i){
                System.out.print("*");
              j++;
            }
            j=1;
            i--;
            System.out.println(" ");

        }
        System.out.println();
        System.out.println("----By changing pattern order----");
        System.out.println();
        int l = 1;
        int m = 1;
        while (l<=5) {
            while (m <= l) {
                System.out.print("*");
                m++;
            }
            m = 1;
            l++;
            System.out.println(" ");
        }






    }
}
