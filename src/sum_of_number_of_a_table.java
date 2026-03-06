import java.util.Scanner;
public class sum_of_number_of_a_table {
    public static void main(String[] args) {
        System.out.println("enter the table number which you want to sum all number");
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int sum =0;
        for(int i = 1; i<=10; i++){
            System.out.println(x+" * "+i+" = "+ (x*i));
            sum = sum+(x*i);
        }
        System.out.println(sum);
        System.out.println();
        System.out.println("By using while loop");
        System.out.println();
        int i =1;
        int add = 0;
        while(i<=10){
            add = add+(x*i);
            i++;
        }
        System.out.println(add);
}
}