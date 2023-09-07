public class onetwoten {
    public static void main(String[] args){
        int year = 2019;
        int month = 5;
        int day = 10;
        int[] daysmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i=0;i<month-1;i++){
            day+=daysmonth[i];
        }
        System.out.println(day);
    }
}
