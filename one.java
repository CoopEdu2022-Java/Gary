import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int name = input.nextInt();
            System.out.println((name % 4 == 0 && name % 100 != 0) || (name % 400 == 0));
            
        }
    }


}
