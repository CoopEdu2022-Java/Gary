public class onetwoone {
    public static void main(String[] args) {
        int months = 12;
        printRabbitPairs(months);
    }
    
    public static void printRabbitPairs(int months) {
        int previous= 1; 
        int current = 1; 
        
        
        
        for (int i = 2; i <= months; i++) {
            int new1 = previous + current; 
            
            System.out.println(i+"       "+ new1);
            
            previous = current;
            current = new1;
        }
    }
}
