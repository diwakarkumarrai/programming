/*

class  Employee{
 int salary;
 int getsalary(){
  return salary;
 }
 String name;
 String getname(){
  return name;
 }
 void  setname(String n){
  name = n;

  }
}





public class question_on_OOPs {
 public static void main(String[] args) {
  Employee diwakar = new Employee();
  diwakar.salary = 199999999;
  System.out.println(  diwakar.getsalary());
  diwakar.name = "Diwakar Kumar Rai";
  System.out.println( diwakar.getname());
  diwakar.setname("Nitil Kumar Rai");
  System.out.println(diwakar.getname());
 }
}

*/

/*

class cellphone{
 public void ring(){
  System.out.println("ringing.....");
 }
 public void vibr(){
  System.out.println("vibrating.....");
 }
 public void call(){
  System.out.println("calling Diwakar  kumar rai.....");
 }

}
public class question_on_OOPs {
 public static void main(String[] args) {
  cellphone nitil = new cellphone();
  nitil.ring();
  nitil.vibr();
  nitil.call();
 }
}


 */



/*
import java.util.Scanner;
public class question_on_OOPs {
 static int greatest(int arr[]) {
  int greater = 0;
  for (int i = 0; i <= 4; i++) {
   if (arr[0] < arr[i]) {
    arr[0] = arr[i];
    greater = arr[i];
   }

  }
  return greater;
 }
  public static void main(String[] args){
   int[] array = {1,2,3,4,5};
   System.out.println(greatest(array));
  }
  }


 */

/*
import java.util.Scanner;
class  greatest{
 public int badka(int[] arr){
  int greater =0;
  for(int i =0;i<=5;i++){
   if(arr[0]<arr[i]){
    arr[0]=arr[i];
    greater = arr[i];
   }
  }
  return greater;
 }

}
public class question_on_OOPs {
 public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  int[] array = new int [6];
   for(int i = 0;i<=5;i++){
    array[i] =sc.nextInt();
   }
   greatest bc = new greatest();
  System.out.println(bc.badka(array));
 }

}


 */

