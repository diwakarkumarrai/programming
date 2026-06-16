import java.util.Scanner;
enum Day{
    Monday(1,"Start of the week"),
    Tuesday(2,"second day of the week"),
    Wednesday(3,"third of the week"),
    Thursday(4,"mid  of the week"),
    Friday(5,"fifth day of the week"),
    Saturday(6,"sixth day  of the week"),
    Sunday(7,"last  of the week");

    private int number ;
    private String description;

    Day(int num , String desc){
         number=num;
        description=desc;

    }
    public int getNumber(){
        return number;
    }
    public String getDescription(){
        return description;
    }


}
public class EnumDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
try {
    System.out.println("Enter the day of the week name starting with capital letter");
    String name = sc.nextLine().trim();

    if(name.isEmpty()){
        System.out.println("Plz enter any one of the weeks day name");
    }
    name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    Day today = Day.valueOf(name);

    System.out.println(today);
    System.out.println(today.getNumber());
    System.out.println(today.getDescription());
}
catch(Exception e){
    System.out.println("error occured: "+e.getMessage());
}
sc.close();
        System.out.println("Thanks for using !!");


    }
}
