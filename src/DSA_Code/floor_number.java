package DSA_Code;

public class floor_number {
     static public int find_target(int[] arr,int target){
        boolean isAscending = arr[0] < arr[arr.length-1];
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target) return arr[mid];

            if(isAscending){
                if(target > arr[mid]) start = mid+1;
                else end = mid-1;
            }
            else{
                if(target>arr[mid]) end =mid-1;
                else start =mid+1;
            }
        }
        if(isAscending){
            return (end>=0) ? arr[end] : -1;
        }
        else{
            return(start<arr.length) ? arr[start] : -1;
        }
     }

    public static void main(String[] args) {
        int [] arr = {6,7,5,3};
        System.out.println("The floor value of the given target is "+find_target(arr,6));
    }
}
