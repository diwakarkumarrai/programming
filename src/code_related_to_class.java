/*
class Employee {

int id;
String name;
int salary = 698; //this salary will assign to those user which salary we not assign and if we assign any other specific salary to other employee then the other value which is assigned is visible. Think it behaves like default

public void print_detail(){
    System.out.println("my name is "+name);
    System.out.println("my id is "+id);
    System.out.println("my salary is "+salary);
    }

}
public class code_related_to_class {
    public static void main(String[] args) {
        System.out.println("Welcome to the Programming World");

        Employee Diwa = new Employee();
        Diwa.id = 2;
        Diwa.salary = 297;
        Diwa.name = "Diwakar Kumar Rai";
        Diwa.print_detail();

        Employee kittu = new Employee();
        kittu.print_detail();
    }
}

*/


/*
//Create a  class Employee with following properties and methods salary , get salary ,name, get name, setname(method changing name)
class Employee {
    int salary;
    String name;

    public void get_name(){
        System.out.println("hey! , My name is "+name);
    }

    public void get_salary(){
        System.out.println("My salary is "+salary);

    }

    public String set_name(String x){
       //System.out.println("Enter the new name which you want to set ");
        name = x;
        return name;
    }
}
public class code_related_to_class {
    public static void main(String[] args) {
        System.out.println("Hey! Welcome to the Programming World");
        Employee Diwa = new Employee();
        Diwa.name = "Diwakar";
        Diwa.salary = 976;
        Diwa.get_name();
        Diwa.get_salary();
        Diwa.set_name("Nitil");
        Diwa.get_name();
    }
}

 */


/*
//Create a class cellphone with method ringing , vibrating , etc;
class cellphone{
    public void ringing(){
        System.out.println("Your phone is Ringing....");
    }

    public void vibrating(){
        System.out.println("Your phone is vibrating....");
    }
}
public class code_related_to_class {
    public static void main(String[] args) {
        cellphone phone = new cellphone();
        phone.ringing();
        phone.vibrating();
    }
}

 */

/*
//Create a class square with a method to initialize its sides , calculating area , perimeter etc
class Square{
    float side;
    public void setSide(float x){
        side = x;
    }
    public float area (){
        return side*side;
    }
    public float perimeter(){
        return 4*side;
    }
}

public class code_related_to_class {
    public static void main(String[] args) {
        Square s = new Square();
        s.setSide(4f);
        System.out.println(s.area());
        System.out.println(s.perimeter());

    }
}

 */

/*
//Create a class rectangle with a method to initialize its sides , calculating area , perimeter etc
class Square{
    float length;
    float breadth;
    public void setSide(float x , float y){
        length = x;
        breadth = y;
    }
    public float area (){
        return length*breadth;
    }
    public float perimeter(){
        return 2*(length+breadth);
    }
}

public class code_related_to_class {
    public static void main(String[] args) {
        Square s = new Square();
        s.setSide(4f , 10f);
        System.out.println(s.area());
        System.out.println(s.perimeter());

    }
}

 */

/*
//craete a class Tommyveceeti for rockstar game capable of hitting , running , firing etc
class Tommyvecetti{
    public void run(){
        System.out.println("Currently running....");
    }

    public void hit(){
        System.out.println("Currently hitting....");
    }

    public void fire(){
        System.out.println("Currently firing....");
    }
}

public class code_related_to_class{
    public static void main(String[] args) {
        Tommyvecetti t1 = new Tommyvecetti();
        t1.run();
        t1.fire();
        t1.hit();
    }

}

 */