public class onetwofive {
    public static void main(String[] args) {
        for (int k=1;k<=1000;k++){
            System.out.println(how(k));
        }

    }
    
    private static int how(int num) {
        int count = 1;
        for (int i = 2; i < num; i++) {
            for (int j=i;j<num;j++){
                if (i*j==num){
                    count+=i;
                    count+=j;
                }
            }
        }
        if (count == num){
            return num;
        }
        else{
            return 0;
        }
    }
}
//1.2.5和1.2.6写反了😂