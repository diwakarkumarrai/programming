public class LiteralsDemo {
    public static void main(String[] args) {
        // integer support different type of literal like decimal literal ,binary literal , octal literal , hexadecimal literal

        //decimal literal
        int x = 100;
        System.out.println(x);

        //binary literal--> for storing binary literal we have to add prefix 0b or 0B
        //in binary number system only 0 and 1 are allowed
        int y = 0b0101;
        //int y1 = 0b0109;---> this will throw error because out of supported number range
        System.out.println(y);

        //octal literal--> for storing octal literal we have to add prefix 0
        //in octal number system only 0 to 7 number are allowed
        int z = 0106;
        //int z1 = 0108;-->this will throw error because out of supported number range which is  only 0 to 7 is supported in octal number system
        System.out.println(z);

        //hexadecimal literal--> for storing hexadecimal literal we have to add prefix 0x or 0X
        // in hexadecimal we use number from 0 to 9 then A =10 ,B=11 ,C=12 ,D=13 ,E=14 ,F=15
        int a =0xFace;
        //int a1 = 0xFacial--->this will throw error because i and l is not in hexadecimal number system
        System.out.println(a);

        /*
        Note:- Java compiler converts all integer literals into a single internal binary form
               Output appears in decimal only because of printing format
         */



        //float f = 10.45; ---> this will throw error because default type of decimal number is double , we have to specify this with 10.45f or 10.45F
        float f = 10.45f;
        System.out.println(f);

        double d = 10.45; // here no need to specify 10.45d because default type is double
        double d1 = 10.45d; // we can also specify if we want but no need
        System.out.println(d);
        System.out.println(d1);

        double d2 = 0712.777; // this is not  octal form this will treated as normal integer because
        /*
        Java specification says:
        Octal literals are only for integer literals
        Floating-point literals always use decimal interpretation for the integer part
        So the compiler ignores octal interpretation when a . is present.

         */
        float f3 = 0712.777f;
        System.out.println(d2);
        System.out.println(f3);



    }
}
