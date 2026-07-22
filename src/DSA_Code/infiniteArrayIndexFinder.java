package DSA_Code;
// Code to search the index of a given element in an infinite array
public class infiniteArrayIndexFinder {
    static public  int searchTarget(int [] arr , int target ) {
        int start =0;
        int end = 1;
        while(target>arr[end]){
            int newStart = end+1;
            end =end+(end-start+1)* 2 ;
            start =newStart;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target) return mid;
            else if (target > arr[mid]) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = i + 1;  // values from 1 to 50
        }
        System.out.println(searchTarget(arr,510));
    }
}
