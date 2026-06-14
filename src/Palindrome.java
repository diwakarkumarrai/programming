import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for(int i =s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("it's Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
