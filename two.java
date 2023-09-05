import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            int all = 1;
            for (int i = 1; i <= num; i++) {
                all = all * i;
            }

            System.out.println(all);
        }
        
        
    }
}
