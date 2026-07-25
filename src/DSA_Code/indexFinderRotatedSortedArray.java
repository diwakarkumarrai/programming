package DSA_Code;



public class indexFinderRotatedSortedArray {
    static public int  rotationCount(int[] arr) {
        //basically it returns the no of count that after how much element array is rotated
        int result = peak_Index(arr);
        if (result==arr.length-1 || result == 0) return -1;
        return result +1;
    }
    static public int index_Finder (int [] arr , int target) {
        if(arr.length == 0) return -1;
        int result = index_Finder1(arr,target);
        return result;
    }

    static int peak_Index(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid is the peak
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: element before mid is the peak
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Left half is sorted, so peak is in the right half
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
            // Right half is sorted, so peak is in the left half
            else {
                end = mid - 1;
            }
        }

        // Array is not rotated
        return arr.length - 1;
    }

    static public int index_Finder1 (int[] arr , int target) {
        int result = peak_Index(arr);
        int start = result +1;
        int end = arr.length -1;
        int resultt = -1;


        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) resultt =mid;
            else if (arr[mid] > target)  end = mid -1;
            else start  = mid+1;
        }

        if (resultt == -1) {
            end = result ;
            start = 0;

            if(arr.length == 1 && arr[0]==target){
                return 0;
            }

            while(start <= end) {
                int mid = start + (end - start)/2;
                if(arr[mid] == target) return mid;
                else if (arr[mid] > target)  end = mid-1;
                else start = mid+1;
            }

        }
        return resultt;

    }

    static public int index_Finder2 (int[] arr , int target) {
        int result = peak_Index(arr);
        int end = result ;
        int start = 0;

        if(arr.length == 1 && arr[0]==target){
            return 0;
        }

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            else if (arr[mid] > target)  end = mid-1;
            else start = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums =  {3,4,5,6,};
        System.out.println(index_Finder(nums,1));
        System.out.println(rotationCount(nums));
     }
}
