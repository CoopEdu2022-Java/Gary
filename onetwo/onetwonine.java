public class onetwonine {
    public static void main(String[] args) {
        for (int i=0;i<1000;i++){
            if (is(i+100)&&is(i+168)){
                System.out.println(i);
            }
                
        }
    }
    public static boolean is(int num){
        for (int i=1;i<num;i++){
            if (i*i==num){
                return true;
            }
        }
        return false;
    }
}
