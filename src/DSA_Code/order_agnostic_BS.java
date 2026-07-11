package DSA_Code;

public class order_agnostic_BS {
    static public int find_tar(int[] arr , int target ){
        if(arr.length==0) return -1;
        int start = 0;
        int  end = arr.length-1;
        boolean isAscending = arr[start] < arr[end];
        while(start<=end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAscending){
                if(target > arr[mid]){
                    start = mid+1;
                }
                else end = mid-1;
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9,88,99};
        int ans = find_tar(arr,99);
        if(ans!=-1) System.out.println("Target element find at index: "+ans);
        else System.out.println("Target element not exist in array");

    }
}
