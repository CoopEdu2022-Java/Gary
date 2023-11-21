package H6;

import java.util.ArrayList;

public class SleepSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < args.length; i++) {
            list.add(i);
        }
        sleepsort(list);

    }
    public static ArrayList<Integer> sleepsort(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            new Thread(()->{ 
                    try {
                        Thread.sleep(list.get(i));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    list1.add(list.get(i));
                
            }).start();
        }
        return list1;
    }
}
