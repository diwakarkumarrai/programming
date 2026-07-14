package DSA_Code;

public class random {
    static public void tar(int[] arr , int target){
        for(int i =0; i<arr.length-1;i++){
            for(int j = 0; j<arr.length-1;j++){
                if(arr[i]+arr[j]==target) {
                    System.out.println("index1: "+i+" index2: "+j);
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8};
        tar(arr,9);
    }
}
