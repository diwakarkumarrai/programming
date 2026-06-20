import java.lang.reflect.Array;
import java.util.Arrays;

public class N_dimension_Array {
    public static void main(String[] args) {


        int[][] x = new int[4][]; //we have to must initialize the root array size else other we can initialize later to bhi kam chl jayega
        x[0] = new int[5]; // yha par ham initialize kar rhe h ki array [0] ka size kya hoga
        x[0][0] = 8;
        x[0][1] = 9;
        x[0][2] = 10;
        x[0][3] = 11;
        x[0][4] = 12;

        x[1] = new int[3]; // yha par ham initialize kar rhe h ki array [1] ka size kya hoga
        x[1][0] = 13;
        x[1][1] = 14;
        x[1][2] = 15;

        x[2] = new int[4]; // yha par ham initialize kar rhe h ki array [2] ka size kya hoga
        x[2][0] = 16;
        x[2][1] = 17;
        x[2][2] = 18;
        x[2][3] = 19;

        x[3] = new int[7]; // yha par ham initialize kar rhe h ki array [3] ka size kya hoga
        x[3][0] = 20;
        x[3][1] = 21;
        x[3][2] = 22;
        x[3][3] = 23;
        x[3][4] = 24;
        x[3][5] = 25;
        x[3][6] = 26;

        //System.out.println(x);  // This will print size of array and its datatype and hashcode like [[I@27716f4
        System.out.println("2D Array");

       String s = Arrays.deepToString(x);
       s = s.replace("], [","], \n[");
       System.out.println(s);

       int [][][] y = new int [3][][];
       y[0] = new int[2][];
       y[1] = new int[3][];
       y[2] = new int[4][];

       y[0][0] = new int[3];
       y[0][1] = new int[4];

       y[1][0] = new int[1];
       y[1][1] = new int[4];
       y[1][2] = new int[2];

       y[2][0] = new int[5];
       y[2][1] = new int[2];
       y[2][2] = new int[1];
       y[2][3] = new int[0];

        y[0][0][0] = 1;
        y[0][0][1] = 2;
        y[0][0][2] = 3;

        y[0][1][0] = 4;
        y[0][1][1] = 5;
        y[0][1][2] = 6;
        y[0][1][3] = 7;

        y[1][0][0] = 8;


        y[1][1][0] = 9;
        y[1][1][1] = 10;
        y[1][1][2] = 11;
        y[1][1][3] = 12;

        y[1][2][0] = 13;
        y[1][2][1] = 14;

        y[2][0][0] = 15;
        y[2][0][1] = 16;
        y[2][0][2] = 17;
        y[2][0][3] = 18;
        y[2][0][4] = 19;

        y[2][1][0] = 20;
        y[2][1][1] = 21;

        y[2][2][0] = 22;

        System.out.println("3D Array");
        String t = Arrays.deepToString(y);
        t = t.replace("], [" , "],"+System.lineSeparator()+"[");
        System.out.println(t);

        // another way to declare  , create , and initialize an array
        int [][] arr =  {
            {1, 2},
            {3, 4},
            {5,6,6}
        };

        System.out.println(Arrays.deepToString(arr));

        //In Java, Object is the parent class of all classes, so this array can hold:
        //Strings
        //Integers (via wrapper class Integer)
        //Arrays
        //Custom objects
        //Anything

        //we can create array of object type
        Object[] z = new Object[5];
        z[0] = new Object();
        z[1] = new String("Diwakar");
        z[2] = new int[]{1,2,3};
        System.out.println(Arrays.deepToString(z));

    }
}
