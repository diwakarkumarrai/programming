   import java.util.Scanner;
   public class practise_question {
       public static void printName(String name){
           System.out.println("Your name is: " + name);
       }
       public static void main(String[] args) {
/*
   //finding greatest and smallest number in an array
        float [] arr = {10.01f,20.99f,20.34f,20.999f,20.09f};
        float max_number = arr[0];
        float min_number = arr[0];
        for(float numbers: arr){
    if( numbers >max_number){
        max_number = numbers;
    }
}
for(float num:arr){
  if(num<min_number){
    min_number=num;
     }
}
System.out.println("The greatest number among this arr is: "+max_number+" and the smallest number among this array is "+min_number);
    }
}


 */



        /*
        String[] name ={"diwa","raman","rahul","agastya","mohan"};
        for(String nam:name){
            System.out.println(nam);
        }
    }
}

         */

        /*
        //counting even and odd number in an array
    Scanner sc = new Scanner(System.in);
    int count1 = 0;
    int count2 = 0;
    int[] arr = new int[16];
    for(int i=0;i < arr;i++){
        System.out.println("Enter the "+(i+1)+" number for array");
        arr[i] = sc.nextInt();
       }
    for(int i : arr){
        if(i%2==0){
            count1 =count1 +1;

        }
        else{
            count2=count2+1;
        }
    }
        System.out.println("The total number count  of even number in this array is  "+count1+" and the number count of odd number is "+count2);
     }
    }



         */

/*
        //program to reverse a array
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.len; i++) {
            System.out.println("enter the " + (i + 1) + " element of the array ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array in reversed order ");
        for(int i =arr.len-1; i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
//this code only print the array value in backward but it does not actually change the array value . array value still same as in order as it is in starting
 */
        /*
        //now we write code to actually reverse the array
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.len; i++) {
            System.out.println("Enter the " + (i + 1) + " element of the array");
            arr[i] = sc.nextInt();
        }
        int left =0;
        int right=arr.len-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left ++;
            right--;
        }
        for (int i = 0; i < arr.len; i++) {
            System.out.println("The " + (i + 1) + " element of the array is: "+ arr[i]);

        }
    }
}

         */

        /*
//code to sum of all array element and tghgeir average

        int sum = 0;
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.len; i++) {
            System.out.println("Enter the " + (i + 1) + " element of the array");
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            sum = sum + num;
        }
        float avg = (sum / (float) arr.len);
        System.out.println("sum of all elemnt is " +sum+ " and the average is "+avg);
    }
}



         */
/*
        //code to find a given target in java
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        for (int i=0;i<arr.len;i++) {

        if(arr[i]==target){
            System.out.println("Element found at index " + i);
        }
        }
    }
}

 */

       /*
        //program to sort an array
//1>> first sort the array in descending order and print second element.
        int temp = 0;
        int[] arr = {89, 22, 34, 242, 244, 24, 72, 23, 9};
        for (int i = 0; i < arr.len-1; i++) {
           for(int j = i+1;j<arr.length;j++){
               if(arr[i]<arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
        }
       System.out.println("Sorted array:");
        for(int num:arr){
            System.out.println(num);
        }
       System.out.println("SECOND GREATEST ELEMENT: "+arr[1]);
    }
}



        */

           /*
           //2>> above method is not efficient because we first sort the all element .
           //this method is efficient for finding second largest element.
           int largest = Integer.MIN_VALUE;
           int second_largest = Integer.MIN_VALUE;
           int[] arr = new int[10];
           Scanner sc = new Scanner(System.in);
           for (int i = 0; i < arr.length; i++) {
               System.out.println("Enter the "+(i+1)+" element of the array ");
               arr[i]=sc.nextInt();
           }
           for(int i =0; i<arr.length; i++){
               if(arr[i]>largest){
                   second_largest=largest;
                   largest = arr[i];
               } else if (arr[i]>second_largest && arr[i] != largest) {
                   second_largest = arr[i];
                   
               }
           }
           System.out.println("The second largest element is: "+ second_largest);
       }
   }

            */

           /*
           // code to remove duplicate element from an array
           //1.this code place zero(0) at the place of duplicate element;
           Scanner sc = new Scanner(System.in);
           int[] arr = new int[10];
           //int [] arrr = new int[10];
           for (int i = 0; i < arr.length; i++) {
               System.out.println("Enter the element " + (i + 1) + " :");
               arr[i] = sc.nextInt();
           }
           for (int i = 0; i < arr.length; i++) {
               for (int j = i+1; j < arr.length
   ; j++) {
                   if (arr[i] == arr[j]) {
                       arr[i] = 0;
                   }

               }
           }
           System.out.println("Array after removing dupllicate:");
           for (int k = 0; k < arr.length; k++) {
               System.out.println(arr[k]);
           }
       }
       }

            */
/*
       //2.this code directly remove the duplicate element from the array;
           Scanner sc = new Scanner(System.in);
           int[] arr = new int[10];
           int n =arr.length;
           //int [] arrr = new int[10];
           for (int i = 0; i <n; i++) {
               System.out.println("Enter the element " + (i + 1) + " :");
               arr[i] = sc.nextInt();
           }
             for (int i = 0; i <n; i++) {
               for (int j = i+1; j <n; j++) {
                   if (arr[i] == arr[j]) {
                       for(int k =j;k<n-1;k++){
                           arr[k]=arr[k+1];

                       }
                       n--;
                       j--;
                   }

               }
           }
           System.out.println("Array after removing dupllicate:");
           for (int l= 0; l <n; l++) {
               System.out.println(arr[l]);
           }
       }
   }

 */
/*
           //code to check whether an array is sorted or not

           int[] arr = new int[10];
           Scanner sc = new Scanner(System.in);
           int n = arr.length;
           for (int i = 0; i < n; i++) {
               System.out.println("Enter the element " + (i + 1) + " :");
               arr[i] = sc.nextInt();
           }
           boolean descending=true;
           boolean ascending=true;
           for (int i = 0; i < n - 1; i++) {
               if (arr[i] < arr[i + 1]) {
                   descending= false;
                   break;
               }

           }
           for (int i = 0; i < n - 1; i++) {
               if (arr[i] > arr[i + 1]) {
                   ascending= false;
                   break;
               }

           }
           if (descending) {
               System.out.println("This array is sorted in Descending order");
           } else if (ascending) {
               System.out.println("This array is sorted in Ascending order");
           }
           else{
               System.out.println("This array is not sorted");
           }

       }
   }


 */

           /*
           //code to check the occurrence / frequency of the repeated  element in an array
           Scanner sc = new Scanner(System.in);
           int[] arr = new int[10];
           int n = arr.length;
           for (int i = 0; i < n; i++) {
               System.out.println("Enter the element " + (i + 1) + " :");
               arr[i] = sc.nextInt();
           }
           int count = 0;
           for (int i = 0; i < n; i++) {
               boolean occurbefore = false;
               for (int l = 0; l < i; l++) {
                   if (arr[i] == arr[l]) {
                       occurbefore = true;
                   }
               }
               if (occurbefore) {
                   continue;
               }

                   for (int j = 0; j < n; j++) {
                       if (arr[i] == arr[j]) {
                           count++;
                       }

                   }
                   if (count > 1) {
                       System.out.println(arr[i] + " repeated " + count + " times");

                   }
                   count = 0;
               }

           }
       }


            */
           /*

//this code right shift the array by your choice number that by how much you want shift
           Scanner sc = new Scanner(System.in);
           int[] arr = new int[10];
           System.out.println("Enter the number of right shift by which you want to shift: ");
           int n = sc.nextInt();


               for (int i = 0; i < arr.length; i++) {
                   System.out.println("Enter the element " + (i + 1) + " :");
                   arr[i] = sc.nextInt();
               }
           for (int m = 1; m <= n; m++){
               int last = arr[arr.length - 1];
               for (int j = arr.length - 1; j > 0; j--) {

                   arr[j] = arr[j - 1];
               }
               arr[0] = last;

           }
           System.out.println("Array after shifting the right:");
           for (int l = 0; l < arr.length; l++) {
               System.out.println(arr[l]);

           }

       }
   }


            */
/*

//this code left shift the array by your choice number that by how much you want shift
           Scanner sc = new Scanner(System.in);
           int[] arr = new int[10];
           System.out.println(arr.length);
           System.out.println("Enter the number of left shift by which you want to shift: ");
           int n = sc.nextInt();


           for (int i = 0; i < arr.length; i++) {
               System.out.println("Enter the element " + (i + 1) + " :");
               arr[i] = sc.nextInt();
           }
           if(n>arr.length){
               n=n%arr.length;
           }
           for (int m = 1; m <= n; m++){
               int first = arr[0];
               for (int j = 0; j <arr.length-1; j++) {

                   arr[j] = arr[j + 1];
               }
               arr[arr.length-1] = first;

           }
           System.out.println("Array after shifting the left:");
           for (int l = 0; l < arr.length; l++) {
               System.out.println(arr[l]);

           }

       }
   }


 */

           /*
           //Two Sum Problem
           //Find two numbers whose sum equals target.

           int[] arr = new int[10];
           Scanner sc = new Scanner(System.in);
           int n = arr.length;
           boolean count = false;
           System.out.println("Enter the target element:");
           int target = sc.nextInt();
           for (int i = 0; i < arr.length; i++) {
               System.out.println("Enter the element " + (i + 1) + " :");
               arr[i] = sc.nextInt();
           }
           for (int j = 0; j < n; j++) {

               for (int k = j+1; k < n; k++) {
                     if (arr[j] + arr[k] == target) {
                       System.out.println("sum of " + arr[j] + " and " + arr[k] + " is equal to the " + target);
                       count=true;
                       break;

                   }



               }
           }
           if (!count){
               System.out.println("There are no any two element which sum is equal to the " + target);
           }
       }

   }

            */
/*

           //finding maximum sum of a subarray.this code only tells the maximum sum but not from which index the subarray start and at where it ends
           Scanner sc = new Scanner(System.in);
           int[] arr = new int[10];
           for (int i = 0; i < arr.length; i++) {
               System.out.println("Enter the element " + (i + 1) + " :");
               arr[i] = sc.nextInt();
           }
        int current_sum = arr[0];
           int max_sum = arr[0];
           for(int j= 1;j<arr.length;j++){
               current_sum=Math.max(arr[j],current_sum+arr[j]);
               max_sum =Math.max(max_sum,current_sum);
           }
           System.out.println("The maximum sum of subarray is: "+max_sum);
       }
   }

 */
/*
           //this code give us maximum sum of a subarray and also tell the index from which it start and at where it ends.

           Scanner sc = new Scanner(System.in);
           int[] arr = new int[10];
           for (int j = 0; j < arr.length; j++) {
               System.out.println("Enter the element " + (j + 1) + " :");
               arr[j] = sc.nextInt();
           }
           int current_sum = arr[0];
           int max_sum = arr[0];
           int temp_start = 0;
           int start = 0;
           int end = 0;
           for (int i = 1; i < arr.length; i++) {
               if(arr[i]>arr[i]+current_sum){
                   current_sum = arr[i];
                   temp_start=i;
               }
               else{

                   current_sum = current_sum+arr[i];
               }
               if(current_sum>max_sum){
                   max_sum=current_sum;
                   start = temp_start;
                   end=i;

               }


           }
           System.out.println("The subarray start from index "+start+" and end at the index "+end+". The maximum sum of  subarray is "+max_sum);
       }
   }


 */

           /*
           // code to find missing number in an array//it work only when the first and last element is correct
           //abhi ye code glt h
           Scanner sc = new Scanner(System.in);
           int [] arr = new  int[10];
           for(int i = 0; i<arr.length; i++){
               System.out.println("Enter the element "+(i+1)+" :");
               arr[i] = sc.nextInt();
           }
           int difference = (arr[arr.length -1]-arr[0])/arr.length;
           for(int j =0;j<arr.length-1;j++){
               if(arr[j+1]!=arr[j]+difference){
                   System.out.println("The missing element is "+(arr[j]+difference)+" which comes after "+arr[j]);
                   break;
               }
           }
       }
   }


            */

           /*
//code to shift all zero at last position
           Scanner sc = new Scanner(System.in);
           int[] arr = new int[10];
           int temp=0;
           for (int i = 0; i < arr.length; i++) {
               System.out.println("Enter the element " + (i + 1) + " :");
               arr[i] = sc.nextInt();
           }

          for (int j = 0; j < arr.length-1; j++) {
            if(arr[j]==0){

                for(int k =j;k<arr.length-1;k++) {
                    arr[k] = arr[k + 1];
                }
                arr[arr.length - 1] = 0;
                j--;
            }

           }
           System.out.println("array after shifting zero to last place ");
           for (int n = 0;  n<arr.length ; n++) {

               System.out.println(arr[n]);

           }
          sc.close();
       }
   }


            */

           /*

           // Another code to shift all zeroes to the last position and this code is very sufficient
           Scanner sc = new Scanner(System.in);
           int[] arr = new int [10];
           int count = 0;
           for (int i  = 0;  i <arr.length ; i++) {
               System.out.println("Enter the element"+(i+1)+" :");
               arr[i] = sc.nextInt();

              if(arr[i]!=0){
                  arr[count]=arr[i];
                  count++;
              }
           }
           if(count<arr.length){
               for(int m = count;m<arr.length;m++){

                   arr[m] = 0;
               }
           }
           System.out.println("Array after shifting all zero to end ");
           for (int c  = 0;  c < arr.length; c++) {
               System.out.println(arr[c]);

           }


            */
         //  printName("diwakar");

           //print pattern like this
           //* * * * *
           //* * * *
           //* * *
           //* *
           // *

           // and the opposite of this pattern


           //this code print the pattern which i have commented
           for(int i = 0;i<6;i++){
               for(int j =i;j<6;j++){
                   System.out.print("* ");
               }
               System.out.println();
           }

           //this code print the opposite of the pattern which i have commented
           for(int i = 0;i<6;i++){
               for(int j =0;j<=i;j++){
                   System.out.print("* ");
               }
               System.out.println();
           }
           }
       }










