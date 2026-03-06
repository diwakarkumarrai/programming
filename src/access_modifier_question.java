import java.util.Scanner;
class circle{
    private float circumference;
    private float area;
    private float Radius;
    public void setradius(float radius){
         Radius = radius ;
    }
    public float  getradius(){
        return Radius;
    }

    public float getCircumference() {
        circumference = 2*3.14f*Radius;
        return circumference;
    }
    public float getArea(){
        area = 3.14f*Radius*Radius;
        return area;
    }
}
public class access_modifier_question {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        circle Circle = new circle();
        System.out.println("Enter the radius for circle");
        float radii = sc.nextFloat();
        Circle.setradius(radii);
          System.out.println(Circle.getradius());

          System.out.println(Circle.getCircumference());
        System.out.println(Circle.getArea());
    }
}