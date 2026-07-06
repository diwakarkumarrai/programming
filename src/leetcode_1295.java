// Leetcode problem number 1295 : Find Numbers with Even Number of Digits
import java.util.Scanner;
public class leetcode_1295 {
    static public int even_count(int []arr){
        int even_count = 0;
        for(int num : arr) {
            int count = 0;
            while (num > 0) {
                num = num / 10;
                count++;
            }
            if (count % 2 == 0) even_count++;
        }
           return even_count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of number that u want to enter(Size of array): ");
        int size = sc.nextInt();
        int []arr = new int[size];

        //Taking input from user and storing in Array
        for (int i =0; i<arr.length;i++){
            System.out.println("Enter element "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }

        int count = even_count(arr);
        System.out.println("Count of number which digit count is even: "+count);
    }
}
