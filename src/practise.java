public class practise {
    public static void main(String[] args) {
        System.out.println("printing star pattern");
     /*   for (int i=1;i<=5;i++) {

            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= (i); j--) {
                System.out.print("*");
            }
              for (int l = 5;l>=i;l--){
                  System.out.print("*");

            }
            System.out.println();
        }

      */
        for (int i =1;i<=5;i++){
           /* for(int j =1;j<i;j++){

                System.out.print(" ");
            }

            */



            for (int k=5;k>=i;k--){
                System.out.print("*");
            }
            for (int l=1;l<i;l++){
                System.out.print("  ");//here we have left double space
            }
            for (int m =5;m>=i;m--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
