package H4_1;

public class H4_1_9 {
    
    public static void main(String[] args) {
        tester test = new tester();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        Thread t3 = new Thread(test);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t1.setPriority(1);
        t2.setPriority(8);
        t1.start();
        t2.start();
        t3.start();

       
    }

}
class tester implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+"           "+Thread.currentThread().getPriority());
    }
    
}