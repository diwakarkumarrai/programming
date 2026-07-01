class Animal{
    public void character(){
        System.out.println("it has 4 legs");
    }
}

class Dog extends Animal{
    public void type(){
        System.out.println("This animal is omnivorous");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("meow");
    }
}

public class instanceof_and_bitwiseDemo {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animall = new Cat();

        System.out.println(animal instanceof  Dog);
        System.out.println(animal instanceof  Animal);

        animal.character();
        //animal.type();// here it is produce error because reference is Animal and it does not contain type() method

        if(animal instanceof Dog){
           Dog dog = (Dog)animal;
            dog.type();// here it does not produce error because we have casted explicitly it to Dog type

        }



    }
}
