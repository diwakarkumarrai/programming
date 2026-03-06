import java.util.Scanner;
public class sumof_n_evennumber {
    public static void main(String[] args) {
        System.out.println("enter the number that how much first even number will be summed");
        Scanner sc =new Scanner(System.in);
        int x =sc.nextInt();
        int n = 1;
        int sum = 0;
        while (n <= x){
            sum = (sum + 2*n);
            n++;
        }
        System.out.println(sum);
        System.out.println();


        System.out.println("----by using for loop----");
        System.out.println();
        int add = 0;
        for(int i=1;i<=x;i++){
            add =add+(2*i);
        }
        System.out.println(add);

    }
}

