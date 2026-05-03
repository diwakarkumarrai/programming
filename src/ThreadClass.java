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

/*

// creating thread with implementing runnable
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

 */


/*
// observing different type of constructor from thread
class MyThread_1 extends Thread{
  public MyThread_1(String name){
      super(name);
  }
  public void run(){
      System.out.println("This thread name is Diwakar");
  }
}

class MyThread_2 extends Thread{
    public MyThread_2(String name){
        super(name);
    }
    public void run(){
        System.out.println("This thread name is Nitil");
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        MyThread_1 t1 = new MyThread_1("Diwakar");
        System.out.println(t1.getState());
        MyThread_2 t2 = new MyThread_2("Nitil");
        t1.start();
        System.out.println(t1.getState());
        t2.start();
        System.out.println("t2 thread name is "+t2.getName());
        System.out.println("t1 thread name is "+t1.getName());
        System.out.println("t1 thread class  is "+ t1.getClass());
        System.out.println(t1.getState());
        System.out.println("t1 thread class is "+ t2.getClass());
        System.out.println("t1 thread detail is "+ t1.toString()); //it returns the thread id,name,priority,group
        System.out.println("t1 thread id is "+ t1.getId());
        System.out.println("t2 thread detail is "+ t2.toString());
        System.out.println("t2 thread id is "+ t2.getId());
        System.out.println("t1 thread priority is "+ t1.getPriority());//this will give default priority
        t1.setPriority(1);
        System.out.println("t1 thread priority is "+ t1.getPriority());//this will give 1 as we set the priority so we have to always set priority of a thread before its start method so it run with the desired priority
        System.out.println(t1.isAlive());
        System.out.println(t1.getState());


    }
}

 */


/*
//observing some methods  of thread

class MyThread_1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("i am thread of class MyThread_1");
            try {
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;

        }
    }
}
class MyThread_2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("i am thread of class MyThread_2");
            i++;
        }
    }
}

public class ThreadClass{
    public static void main(String[] args) {
        MyThread_1 t1 = new MyThread_1();
        MyThread_2 t2 = new MyThread_2();

        t1.start();

        try{
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();

    }
}

 */

//WAP to continuously print Good Morning and Welcome on the screen using Thread
//WAP to add a sleep method in welcome thread to delay it execution for 200ms
//WAP to demonstrate get priority and set priority method
//WAP to get state of a thread
//WAP to get reference to the current thread

class MyThread_1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 9) {
            System.out.println("Good Morning");
            i++;
        }
    }
}
class MyThread_2 implements Runnable{
    public void run () {
        int i = 0;
        while (i < 9) {
            System.out.println("Welcome");
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
public class ThreadClass{
    public static void main(String[] args) {
        MyThread_1 t1 = new MyThread_1();
        Thread s1 = new Thread(t1);

        MyThread_2 t2 = new MyThread_2();
        Thread s2 = new Thread(t2);
        s2.setPriority(Thread.MAX_PRIORITY);
        s1.setPriority(Thread.MIN_PRIORITY);
        s1.start();
        s2.start();
        System.out.println("welcome thread is in "+ s2.getState()+ " state");
        System.out.println("Priority of thread good morning is "+ s1.getPriority());
        System.out.println("Priority of thread welcome is "+ s2.getPriority());
        System.out.println("id of the good morning thread is "+Thread.currentThread().threadId());//or getId()

    }
}
