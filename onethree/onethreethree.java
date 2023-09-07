package onethree;
import java.util.Scanner;
public class onethreethree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scannerInt = scanner.nextInt();
        for (int i=1;i<=scannerInt/2+1;i++){
            System.out.println(" ".repeat(scannerInt/2+1-i)+"*".repeat(2*i-1));

        }
        for (int i=scannerInt/2;i>=1;i--){
            System.out.println(" ".repeat(scannerInt/2+1-i)+"*".repeat(2*i-1));
        }
        
    }
}
