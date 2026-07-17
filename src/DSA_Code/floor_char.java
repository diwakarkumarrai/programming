package DSA_Code;

public class floor_char {
   static public char previousSmallestNumber (char [] letters , char target){

       int start = 0;
       int end = letters.length-1;

       while (start<=end){
           int mid = start + (end-start)/2;

           if(target <= letters[mid]) end = mid-1;
           else start = mid+1;
       }

       return (end>=0) ? letters[end] : letters[0];
   }

    public static void main(String[] args) {
        char[] arr = {'d','g','j','j','y'};
        System.out.println(previousSmallestNumber(arr,'b'));
    }
}
