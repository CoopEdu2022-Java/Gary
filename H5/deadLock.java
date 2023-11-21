package H5;

public class deadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0, "灰姑娘");
        Makeup g2 = new Makeup(1, "白雪公主");
        g1.start();
        g2.start();
    }
}

class Lipstick {
    
}

class Mirror {
    
}

class Makeup extends Thread{
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();
    int choice;
    String girlName;
    Makeup(int choice, String girlName){
        this.choice = choice;
        this.girlName = girlName;
    }
    @Override
    public void run() {
        makeup();
    }
    private void makeup(){
        if (choice==0) {
            synchronized (lipstick) {
                System.out.println(this.girlName+"获得口红的锁");
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            synchronized (mirror) {
                System.out.println(this.girlName+"获得镜子的锁");
                try {
                    Thread.sleep(2000);
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }synchronized (lipstick) {
                System.out.println(this.girlName+"获得口红的锁");
            }
                    
        }
    }
    
}