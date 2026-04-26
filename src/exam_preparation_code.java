class test implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread running");
    }
}
class exam_preparation_code {
    public static void main(String[] args) {
    Thread t = new Thread(new test());
     t.start();
}
}