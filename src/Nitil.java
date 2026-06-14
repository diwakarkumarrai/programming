import java.time.LocalDateTime;


class MyThread implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {
            LocalDateTime now =LocalDateTime.now();
            System.out.println(now);

            try{
                Thread.sleep(100);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

    }
}

public class Nitil{
    public static void main(String[] args) {

        MyThread t = new MyThread();
        Thread t1 = new Thread(t);

        t1.start();


    }
}
