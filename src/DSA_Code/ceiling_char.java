//Find Smallest Letter Greater Than Target
// Leet code 744

package DSA_Code;
public class ceiling_char {
    static public char nextGreatestLetter(char[] letters , char target){
        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target >= letters[mid]) start = mid+1;
            else end = mid-1;
        }
        return letters[start%letters.length];
    }

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char []{'a','b','c','f','h'},'h'));
    }
}
