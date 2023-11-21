package H5;

public class UnsafeBank {
    
}

class Account{
    int money;
    String name;
    public Account(int money,String name){
        this.money = money;
        this.name = name;
    }
}

class Drawing extends Thread{
    Account account;
    int drawingMoney;
    int packetTotal;
    public Drawing(Account account,int drawingMoney,String name){
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }
    public void run(){
        if(account.money-drawingMoney<0){
            System.out.println(this.getName()+"-->账户余额不足，取款失败");
            return;
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        account.money -= drawingMoney;
        packetTotal += drawingMoney;
        System.out.println(this.getName()+"-->账户余额为："+account.money);
        System.out.println(this.getName()+"-->口袋的钱为："+packetTotal);
    }
}
