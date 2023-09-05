public class onetwotwo {
    public static void main(String[] args) {
        int count = 0;
        for (int i=101;i<=200;i++){
            
            boolean isPrime = true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);

    }
    
}
