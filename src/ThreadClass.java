/*
// Creating thread class using  threads class
class MyThread_t1 extends Thread{
    @Override
    public void run (){
        System.out.println("Good Morning!");
        System.out.println("Thread_t1 is running");
    }
}

class MyThread_t2 extends Thread{
    @Override
    public void run (){
        System.out.println("Good AfterNoon!");
        System.out.println("Thread_t2 is running");
    }
}
public class ThreadClass {
    public static void main(String[] args) {
         MyThread_t1  t1 = new MyThread_t1();
         MyThread_t2 t2 = new MyThread_t2();
         t1.start();
         t2.start();
    }
}
*/

class RunnableClass_1 implements Runnable{
    @Override
    public void run (){
        int i = 0;
        while(i<6){
            System.out.println("RunnableClass_1 thread is running");
            i++;
        }
    }
}

class RunnableClass_2 implements Runnable{
    @Override
    public void run (){
        int i = 0;
        while(i<6){
            System.out.println("RunnableClass_2 thread is running");
            i++;
        }
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        RunnableClass_1 r1 = new RunnableClass_1();
        Thread t1 = new Thread(r1);

        RunnableClass_2 r2 = new RunnableClass_2();
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}