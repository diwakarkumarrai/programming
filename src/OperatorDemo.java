public class OperatorDemo {
    public static void main(String... args) {

        byte a = 10;
        //a= a+10; // not valid because by default java considered a and 10 as int then perform addition then the result is of int datatype ,and we can fit int into byte
        a = (byte)(a+10); // we have to typecast in byte
        System.out.println(a);
       // System.out.println(10 / 0);//this will give runtime exception : / by zero
        System.out.println(10/0.0);//this will give output as : infinity

    }
}
