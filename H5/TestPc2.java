package H5;

public class TestPc2 {
    public static void main(String[] args) {
        TV tv=new TV();
        new Thread(new Player(tv)).start();
        new Thread(new Watcher(tv)).start();
    }
    
}
class Player implements Runnable{
    TV tv;
    public Player(TV tv){
        this.tv=tv;
    }
    @Override
    
    public void run() {
        for (int i=0;i<20;i++){
            if (i%2==0){
                this.tv.play("快乐大本营播放中");
            } else {
                this.tv.play("抖音：记录美好生活");
            }
        }
    }
}
class Watcher implements Runnable{
    TV tv;
    public Watcher(TV tv){
        this.tv=tv;
    }
    @Override
    public void run() {
        
        for (int i=0;i<20;i++){
            tv.watch();
        }
    }
}
class TV{
    String voice;
    boolean flag=true;
    public synchronized void play(String voice){
        if (!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("播放了"+voice);
        this.voice=voice;
        this.notifyAll();
        this.flag=!this.flag;
    }
    public synchronized void watch(){
        if (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("听到了"+voice);
        this.notifyAll();
        this.flag=!this.flag;
    }
}