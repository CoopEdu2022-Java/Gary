import java.util.ArrayList;

public class onetwoeight {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int count = how(a);
        System.out.println(count);


    }
    public static int how(int[] a) {
        int count = 0;
         for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    if (i != j && i != k && j != k) { 
                        int num = a[i] * 100 + a[j] * 10 + a[k];
                        System.out.println(num);
                        count++;
                    }
                }
            }

        }
        return count;}
}
