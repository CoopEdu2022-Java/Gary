package H5;

public class UnafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();
        new Thread(station,"小明").start();
        new Thread(station,"老师").start();
        new Thread(station,"黄牛党").start();
    }

}
class BuyTicket implements Runnable{
    private int ticketNums = 10;
    private boolean flag = true;
    public void run(){
        while(flag){
            try{
                buy();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
    private synchronized void buy() throws InterruptedException{
        if(ticketNums<=0){
            flag = false;
            return;
        }
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
    }
}
