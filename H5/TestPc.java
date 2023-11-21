package H5;

public class TestPc {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();
        new Thread(new profucter(container)).start();
        new Thread(new Consumer(container)).start();
    }
}
class profucter implements Runnable{
    SynContainer container;
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            container.push(new chiken(i));
            System.out.println("生产了"+i+"只鸡");
        }
    }
    public profucter(SynContainer synContainer){
        this.container = synContainer;
    }
}
class Consumer implements Runnable{
    SynContainer container;
    public Consumer(SynContainer synContainer){
        this.container = synContainer;
    }
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("消费了"+container.pop().id+"只鸡");
        }
    }
    
}
class chiken{
    int id;
    public chiken(int id){
        this.id=id;
    }
}
class SynContainer{
    chiken[] chikens=new chiken[10];
    int count=0;
    public synchronized void push(chiken chiken){
        if (count==chikens.length){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        chikens[count]=chiken;
        count++;
        this.notifyAll();
    }
    public synchronized chiken pop(){
        if (count==0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        chiken chiken=chikens[count];
        this.notifyAll();
        return chiken;
    }
    public synchronized void esrfg(){
        if(count==0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}