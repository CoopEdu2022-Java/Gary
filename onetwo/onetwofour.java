import java.util.Scanner;
public class onetwofour {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String result = "";
        result = (num>=90)?"A":(num>=60)?"B":"C";
        System.out.println(result);
        input.close();
    }
}
