package onethree;

import java.util.Scanner;

public class onethreefive {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            if (num != 0 && num % 10 == 0) {
            
            System.out.println("No");

            };
            int reversed = 0;
            while (num > reversed) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            if (num == reversed ) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
    }
    
}
