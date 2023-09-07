package onethree;
import java.util.Random;
public class onethreetwo {
    public static void main(String[] args) {
        String[] arry = {"a", "b", "c", "x", "z", "y"};
        Random random = new Random();
        int randomInt = random.nextInt(3);
        int randomInt1 = random.nextInt(arry.length);
        while (randomInt1>=2){
            randomInt1 = random.nextInt(arry.length);
        }
        if (!(randomInt==0&&randomInt1==3)&&!(randomInt==3&&randomInt1)) {
            
        } else {
            System.out.println("same");
        }
    }
}
