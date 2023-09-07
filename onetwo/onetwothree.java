package onetwo;
import java.util.Scanner;
public class onetwothree {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int number = input.nextInt();
            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    System.out.print(i);
                    number /= i;
                    
                    if (number != 1) {
                        System.out.print(" * ");
                    }
                }
            }
        }

    }
}
