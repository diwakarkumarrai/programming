/*
import java.time.LocalDateTime;
class Thread1 implements Runnable{
    public void run() {

        for (;;) {
            LocalDateTime now = LocalDateTime.now();

            int hour = now.getHour();
            int minute = now.getMinute();
            String period =(hour<12) ? "AM":"PM";

            if(hour>12){
                hour=hour-12;

            }
            else if(hour == 0){
                hour = 12;
            }

           String hh = String.format("%02d",hour);
           String mm = String.format("%02d",minute);

           System.out.println(hh+":"+mm+" " +period);

           try {
                Thread.sleep(1000 * 60);
           } catch (InterruptedException e) {
                throw new RuntimeException(e);
           }

        }
    }
}

public class DigitalClock {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread t = new Thread(t1);
        t.start();
    }
}

 */

// now using ScheduledExecutorService , here no infinite loop is using so complexity is better than previous code

import java.time.LocalDateTime;
import java.util.concurrent.*;
import java.io.Console;
public class DigitalClock{
    public static void main(String[] args) {

        //ScheduledExecutorService is used to schedule task and run it with initial delay and a fixed delay of timing in minute second hour or day
        ScheduledExecutorService Scheduler = Executors.newSingleThreadScheduledExecutor();
        Runnable task =()->{
            try {
                LocalDateTime now = LocalDateTime.now();
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();

                //This code for managing AM and PM
                String period = (hour >= 12) ? "PM" : "AM";

                //This code for converting 24 hour format time to 12 hour format time
                if (hour > 12) {
                    hour = hour - 12;
                } else if (hour == 0) {
                    hour = 12;
                }
                //  formatting the single digit integer in Double digit by adding 0 before it
                String hh = String.format("%02d", hour);
                String mm = String.format("%02d", minute);
                String ss = String.format("%02d", second);
                // This line overwrite the previous output
                System.out.print("\r" + hh + ":" + mm + ":" + ss + " " + period);//-->/r is carriage return , it is a type of escape character it sends your cursor in the beginning of the same line

            }
            catch(Exception e){
                System.out.println("Error in updating clock"+e.getMessage());
            }

        };
        try {
            Scheduler.scheduleAtFixedRate(
                    task, 0, 1, TimeUnit.SECONDS
            );
        } catch (Exception e) {
            System.out.println("Error occurs in scheduling task"+e.getMessage());
        }
        //This is the shutdown hook code which clean the all resource completely during closing the program
        // if we remove this block of code then also our code will run perfectly and display the time
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\nShutting down clock...");
            Scheduler.shutdown();
            try {
                // Wait up to 5 seconds for existing tasks to finish
                if (!Scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
                    Scheduler.shutdownNow(); // Force shutdown if not finished
                }
            } catch (InterruptedException e) {
                Scheduler.shutdownNow();
                Thread.currentThread().interrupt();
            }
            System.out.println("Clock stopped.");
        }));

    }
}