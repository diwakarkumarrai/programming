//  Leetcode problem number 1672 : Richest Customer Wealth
import java.util.Scanner;
public class RichestCustomerWealth {

    static public int highest_sum(int[][]arr){
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            if(sum>max_sum) max_sum=sum;
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int [][]arr = {
                {23,45,54,33},
                {34,324,354,2,233,23},
                {43,54,33},
                {23,42,432,23,234}
        };

         int ans = highest_sum(arr);
        System.out.println("The highest sum of wealth of a individual person account is :"+ans);
    }
}
