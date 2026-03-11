import  java.util.*;
public class java_array_question {
    public static void main(String[] args) {
        /*
        //create a array of 5 float and calculate their sum
        Scanner sc = new Scanner(System.in);
        float sum =0f;
        float[] arr = new float[5];
        for (int i = 0;  i<arr.length ; i++) {
            System.out.println("Enter the "+(i+1)+" element for this array ");
            arr[i]= sc.nextFloat();
        }
        for(int j =0;j< arr.length;j++){
           sum +=arr[j];
        }
        System.out.println("The sum of total element is "+sum);
        */


        /*
        //WAP to find the given element is present is array or not
        Scanner sc = new Scanner(System.in);

        float[] arr = new float[5];
        float target = 56f;
        boolean count = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " element for this array ");
            arr[i] = sc.nextFloat();
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target) {
                //System.out.println("Element is found at index " + j);
                count = true;
                index = j;
            }
        }
        if (count) {
            System.out.println("The target element is  present in this array at index " + index);
        } else {
            System.out.println("The target element is not present in this array ");
        }


         */

        /*
        //WAP to find array is sorted or not
        Scanner sc = new Scanner(System.in);

        float[] arr = new float[5];
        boolean count1 = false;
        boolean count2 = false;
        boolean count3 = false;


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " element for this array ");
            arr[i] = sc.nextFloat();
        }

        for(int j = 0; j<arr.length-1;j++){
            if(arr[j]<arr[j+1]){
                System.out.println("This array is not sorted in descending order");
                count1=false;
               break;

            }
            else{
                count1=true;
            }


        }

        for(int j = 0; j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                System.out.println("This array is not sorted in Ascending order");
                count2=false;
               break;
            }
            else{
                count2=true;
            }

        }
        for(int j = 0; j<arr.length-1;j++){
            if(arr[j]==arr[j+1]){
                count3=true;
            }
            else{
                count3=false;
                break;
            }
        }


        if(count3){
            System.out.println("The all entered element in this array is equal");
        }
        else if(count1){
            System.out.println("This array is sorted in Descending order");

        }
        else if(count2){
            System.out.println("This array is sorted in Ascending order");
        }


         */


        /*
        // efficient way to check array is sorted or not
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element " + (i + 1) + " for array ");
            arr[i] = sc.nextInt();
        }
        boolean ascending = true;
        boolean descending = true;

        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                descending = false;
            }
            if (arr[j] > arr[j + 1]) {
                ascending = false;
            }
        }

        if(ascending){
            System.out.println("Array is sorted in Ascending order");
        }
        else if(descending){
            System.out.println("Array is sorted in descending order");
        }
        else{
            System.out.println("Array is not sorted");
        }

         */

    }
}

