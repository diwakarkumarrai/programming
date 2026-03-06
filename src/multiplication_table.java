import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers which table you want to print");
        int n = sc.nextInt();
        for (int i = 1; i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
        System.out.println();
        System.out.println("------in reverse order------");
        System.out.println();

        for (int i = 10; i>=1;i--){
            System.out.println(n+" * "+i+" = "+(n*i));
        }


    }
}
