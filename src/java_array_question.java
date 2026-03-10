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
    }

}

