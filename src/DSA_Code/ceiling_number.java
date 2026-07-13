package DSA_Code;
/*
// find ceil value of target number in sorted array
public class ceiling_number {
    static public int find_ceil(int[] arr , int target){
        boolean isAscending = arr[0]<arr[arr.length-1];
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start +(end-start)/2;

            if(arr[mid]==target) return arr[mid];

            if(isAscending){
                if(target > arr[mid]) start = mid+1;
                else end =mid-1;
             }
            else{
                if(target > arr[mid]) end = mid-1;
                else start = mid+1;
            }
        }
        if(isAscending) {
            for (int j : arr) {
                if (target < j) return j;
            }
        }
        else{
            for (int j = 0; j < arr.length; j++) {
                if(target > arr[j]) return arr[j-1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = { 1,3,5,7,9,56,89};
        System.out.println("The ceil value is: "+find_ceil(arr,88));
    }

}


 */

public class ceiling_number {
    static public int find_ceil(int[] arr , int target){
        boolean isAscending = arr[0]<arr[arr.length-1];
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start +(end-start)/2;

            if(arr[mid]==target) return arr[mid];

            if(isAscending){
                if(target > arr[mid]) start = mid+1;
                else end =mid-1;
            }
            else{
                if(target > arr[mid]) end = mid-1;
                else start = mid+1;
            }
        }
        if(isAscending){
            return (start < arr.length) ? arr[start] : -1;
        }
        else{
            return (end >= 0) ? arr[end] : -1;

        }
    }

    public static void main(String[] args) {
        int [] arr = { 1,3,5,7,9,56,89};
        System.out.println("The ceil value is: "+find_ceil(arr,84));
    }

}