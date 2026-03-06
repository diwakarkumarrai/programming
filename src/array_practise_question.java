import java.util.Scanner;
public class array_practise_question {
    public static void main(String[] args) {

        // create an array of 5 floats and calculate their sum
        float[] number = new float[5];
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        int i = 0;
        for (i = 0; i < number.length; i++) {
            System.out.println("Enter the " + (i + 1) + " number :");
            number[i] = sc.nextFloat();
            sum = sum + number[i];
        }
        System.out.println("The sum of all number in the array is " + sum);
        float add = 0;
        for (float ginti : number) {
            add = add + ginti;
        }
        System.out.println("The sum of all number in the array by for each loop is " + add);

    }
}

        /*
        //Write a program to find out whether a given integer is present in the array or not
        Scanner sc =new Scanner(System.in);
        int[] numbers =new int[5];
        for(int i = 0; i< numbers.length;i++ ){
            System.out.println("Enter the "+(i+1)+" number :");
            numbers[i]=sc.nextInt();
        }
        boolean found = false;
        System.out.println("enter the number which you want to find that it is present in array or not ");
        int target =sc.nextInt();

        for(int i = 0; i < numbers.length;i++ ){
            if(numbers[i]==target){
                found=true;
                break;
            }
        }
        if(found==true){
            System.out.println("yes this number is present in array");
        }
        else{
            System.out.println("this number is not present in array");
        }

         */


        /*

        //calculating the average marks from an array containing marks of all students in physics using for each loop
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("enter the marks of "+(i+1)+" subject");
            marks[i] = sc.nextInt();
        }
        for (int number:marks){
            sum = sum + number ;
        }
        float average = (sum/500f)*100f;
        System.out.println("The average of the student is "+average);

         */


        /*
        // create a java program to add two matrices of size 2*3
        int[][] matrix1 = new int[2][3];
        int[][] matrix2 = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<2;i++){
            for (int j =0; j<3; j++){
                System.out.println("Enter the ["+i+"]"+" ["+j+"] element of matrix1");
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        for (int i = 0;i<2;i++){
            for (int j =0; j<3; j++){
                System.out.println("Enter the ["+i+"]"+" ["+j+"] element of matrix2");
                matrix2[i][j] = sc.nextInt();
            }
        }


        // int[][] matrix1 ={{1,2,3},{4,5,6}};
        //int[][] matrix2 = {{7,8,9},{10,11,12}};
        int[][] resultmatrix = new int[2][3];

        for (int i = 0;i<2;i++){
            for (int j =0; j<3; j++){
                resultmatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0;i<2;i++){
            System.out.print("{  ");
            for (int j =0; j<3; j++){
                System.out.print(resultmatrix[i][j]+"  ");
            }
            System.out.print("}");
            System.out.println();
        }


         */


/*
        //write a program to reverse an array

      Scanner sc =new Scanner(System.in);
      int[] arrayy = new int[5];
        for (int i =0;i<arrayy.length;i++){
            System.out.println("Enter the "+(i+1)+" element of array");
               arrayy[i] =sc.nextInt();
            }

        for (int i=0;i< arrayy.length;i++){
            System.out.println("The "+(i+1)+" element of the array is: "+arrayy[i]);
        }

        for(int i = 0; i< arrayy.length;i++){
            arrayy[i] =arrayy[4-i];
        }
        System.out.println("after reversing the array");
        for (int i =0; i< arrayy.length;i++){
            System.out.println("The "+(i+1)+" element is: "+ arrayy[i]);

        }

 */

        /*

        //write a java program to find the maximum element in an array

        Scanner sc =new Scanner(System.in);
        int[] array = new int[10];
        for (int i= 0; i< array.length;i++){
            System.out.println("Enter the "+(i+1)+" element of array: ");
            array[i] =sc.nextInt();
        }
        int max  = array[0];
        for (int i =0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }

        }
        System.out.println("The maxmimum number in this array is "+max);

         */



        /*

        //write a java program to find the mimimum element in an array

        Scanner sc =new Scanner(System.in);
        int[] array = new int[10];
        for (int i= 0; i< array.length;i++){
            System.out.println("Enter the "+(i+1)+" element of array: ");
            array[i] =sc.nextInt();
        }
        int minimum = array[0];
        for (int i =0;i<array.length;i++){
            if(array[i]<minimum){
                minimum = array[i];
            }

        }
        System.out.println("The minimum number in this array is "+minimum);

         */


        // Write a java program to find whether an array is sorted or not
/*
        Scanner sc =new Scanner(System.in);
        int[] array = new int[5];
        boolean isdescending = true;
        boolean isascending = true;
        for (int i= 0; i< array.length;i++){
            System.out.println("Enter the "+(i+1)+" element of array: ");
            array[i] =sc.nextInt();
        }

        for (int i = 0; i < array.length-1;i++){
            if (array[i] <= array[i + 1]) {
                isdescending = false;
                break;
            }

        }
      if(isdescending){
          System.out.println("this array is  sorted in descending order");
      }
      else {
          System.out.println("this array is not sorted in descending order");
      }


        for (int i = 0; i < array.length-1;i++){
            if (array[i] >= array[i + 1]) {
                isascending = false;
                break;
            }

        }
        if(isascending){
            System.out.println("this array is  sorted in ascending order");
        }
        else {
            System.out.println("this array is not sorted in ascending order");
        }


        if (isascending || isdescending){
            System.out.println("this array is sorted");
        }
        else {
            System.out.println("this array is not sorted");
        }

    }
    }

*/