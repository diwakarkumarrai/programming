class mythread extends Thread{
    public void run(){
        System.out.println("this is thread class");
    }
}
public class exampractice{
    public static void main(String[] args) {
        mythread t1 = new mythread();
        mythread t2 = new mythread();
        mythread t3 = new mythread();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

    }
}