public class onetwoseven {
    public static void main(String[] args) {
        int result = jump(10, 1, 0); 
        System.out.println(result); 
    }
    
    public static int jump(int n, int m, int all) {
        if (m == 1) { 
            return jump(10, m + 1, 10);
        } else if (m <= 10) { 
            return jump(n / 2, m + 1, all + n);
        } else { 
            return all;
        }
    }
}
