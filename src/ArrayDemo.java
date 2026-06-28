import java.util.Arrays;

public class ArrayDemo {

    public static void swapValues(int[] arr){
        int temp = arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
    }

    public static int findMax(int[] arr){
        int highest = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > highest) {
                highest = j;
            }
        }
        return highest;
    }

    public static int[] reverseArray(int[] arr){
        for(int i = 0; i < (arr.length/2); i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {9,11,12,10,13};

        System.out.println("Array elements are : "+Arrays.toString(arr));

        System.out.println("Array after reversing the element :"+Arrays.toString(reverseArray(arr)));

        System.out.println("Array before swapping first and second element: "+Arrays.toString(arr));

        swapValues(arr);

        System.out.println("Array after swapping first and second element: "+Arrays.toString(arr));

        System.out.println("Maximum element in this array is :"+findMax(arr));

    }
}
