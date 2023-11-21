package H5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TestLock2 implements Runnable{
    private int threadNum;  // 添加线程编号属性
    private int ticketNums = 10;
    private Lock lock = new ReentrantLock();  // 定义锁对象

    public TestLock2(int threadNum) {  // 构造函数，传入线程编号
        this.threadNum = threadNum;
    }

    @Override 
    public void run(){
        while (true){
            try{
                if (ticketNums>0){
                    lock.lock();
                    try {
                        Thread.sleep(100);
                        System.out.println("Thread " + threadNum + " sold one ticket, now left: " + (--ticketNums));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}

