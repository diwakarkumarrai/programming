package DSA_Code;

public class linear_search {
    static int search(int[] arr , int target){
        for(int i =0; i<arr.length; i++){
            if(arr[i]==target){
                return i ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 46, 2, 9, 56, 44, 34, 348, 25};
        int index =  search(arr,44);

        if(index!=-1) System.out.println("Element found at index "+ index);
        else System.out.println("Element not found");
    }
}
