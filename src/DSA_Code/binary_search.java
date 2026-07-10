package DSA_Code;
public class binary_search {

    static public void arr_sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int temp ;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int find_targ(int[] arrr,int target ) {
        arr_sort(arrr);

        int start = 0;
        int end = arrr.length-1;

        while (start<=end) {
            int mid = start + (end - start)/2;
            if(arrr[mid]==target) return mid;
            else if (target > arrr[mid])  start = mid+1;
            else end = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int ans = find_targ(new int[]{1,2,3,4,5,6,9,010,0X10,0b1111},16);
        System.out.println("Target found at index: "+ ans);
    }
}
