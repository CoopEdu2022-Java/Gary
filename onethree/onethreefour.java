package onethree;

import java.util.Scanner;

public class onethreefour {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int scannerInt = scanner.nextInt();
            int all =1;
            for (int i=1;i<=scannerInt;i++){
                all*=i;
            }
            System.out.println(all);
        }
    }
}
