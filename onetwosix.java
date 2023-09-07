import java.util.Scanner;

public class onetwosix {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            int m = scanner.nextInt();
            
            
            int n = scanner.nextInt();
            
            int d = findd(m, n); 
            int x = findx(m, n); 
            
            System.out.println(d);
            System.out.println(x);
        }
    }
    
    // 求最大公约数
    public static int findd(int x, int y) {
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
    
    // 求最小公倍数
    public static int findx(int x, int y) {
        return x * y / findx(x, y);
    }
}

