/*
// This code is valid for finding only 3-digit integer number that it is Armstrong or not
public class ArmstrongNumber {

    public static  boolean isArmstrong(int n){
        int sum = 0;
        int originalNo  = n;
        while(n > 0){
            int digit = n % 10;
            sum +=(digit*digit*digit);
            n /=10;
        }
        return originalNo == sum;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}

 */



// This code is valid for finding only 3-digit integer number that it is Armstrong or not
public class ArmstrongNumber {

    public static boolean isArmstrong(int n) {
        int count = 0;
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int sum = 0;
        int originalNo = n;

        while (n > 0) {
            int digit = n % 10;
            //sum += (int)Math.pow(digit, count);
            /*  Avoid Math.pow() why ?
            It returns double
            Slightly slower
            Requires casting to int
            Not ideal for integer-based problems
            Also it is slower than loop overall reduce performance
            */

            // Manual power calculation
            int power =1;
            for (int i = 0; i < count; i++) {
                power*=digit;
            }
            sum+=power;
            n /= 10;
        }
        return originalNo == sum;
    }

    public static void main(String[] args) {
       for(int i =0; i<10000;i++){
           if(isArmstrong(i)){
               System.out.println(i);
           }
       }
    }
}














