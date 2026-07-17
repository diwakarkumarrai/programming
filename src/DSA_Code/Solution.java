package DSA_Code;
/*
import java.util.Arrays;

public class Solution {
    static public int[] searchRange(int [] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int index1 = -1;
        int index2 = -1;

        while(start<=end){

            if(index1 != -1 && index2 != -1) break;

            int mid = start+(end-start)/2;

            if(arr[mid] > target) end = mid-1;
            else if (arr[mid] < target) start = mid+1;
            else{
                for (int i = mid; i >= 0;i--){

                    if (arr[i] != target) {
                        index1 = i+1;
                        break;
                    }
                    else if(i==0){
                        index1 = i;
                        break;
                    }
                }

                for (int i = mid; i < arr.length;i++){

                    if (arr[i] != target) {
                        index2 = i-1;
                        break;
                    }
                    else if(i==arr.length-1){
                        index2 = i;
                        break;
                    }
                }
            }
        }
        return new int[] {index1 ,index2};
    }

    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
}

 */

// above code uses linear search in worst case time complexity become O(n)
//so we write code which only uses binary search which time complexity should be O(log n)

import java.util.Arrays;

public class Solution {
    static public int [] searchRange(int [] arr,int target){
        int first = findFirst(arr,target);
        int last = findLast(arr,target);
        return new int [] {first , last};
    }
    static int findFirst(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int first  = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid]>target) end = mid-1;
            else if (arr[mid]<target) start = mid+1;
            else{
                first = mid;
                end = mid -1;
            }
        }
        return first;
    }

    static int findLast(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int Last  = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid]>target) end = mid-1;
            else if (arr[mid]<target) start = mid+1;
            else{
                Last = mid;
                start = mid + 1;
            }
        }
        return Last;
    }

    public static void main(String[] args) {
        int [] arr = { 4,6,8,9,14,17,17,17,17,17};
        System.out.println(Arrays.toString(searchRange(arr,17)));
    }


}

