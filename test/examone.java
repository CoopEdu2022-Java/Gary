package test;

import java.util.ArrayList;

import java.util.Scanner;

public class examone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        int input2 = input.nextInt();
        ArrayList<String> m1 = chain(input1, input2);
        ArrayList<String> m2 = havebinary(input2, input2);
        System.out.println(compare(m1, m2));

    }
    public static ArrayList<String> chain(String input1, int input2) {
        int n1=0;
        int n2=input2;
        ArrayList<String> chain1 = new ArrayList<String>();
        for (int i=0; i<=input1.length()/input2; i++) {
            if (n2 > input1.length()) {
                n2 = input1.length();
            }
            chain1.add(input1.substring(n1, n2));
            n1+=input2;
            n2+=input2;

        }
        System.out.println(chain1);
        return chain1;
    }
    
    
    public static String toBinary(int num, int input2) {
        String str = "";
        StringBuilder sb = new StringBuilder(input2);
        for (int i=0; i<input2; i++) {
            sb.append("0");
        }
        while (num != 0) {
            str = num % 2 + str;
            num = num / 2;
        }
        sb.insert(sb.length()-str.length(), str);
        if (sb.length() > input2) {
            sb.delete(0, sb.length()-input2);
        }
        return sb.toString();
    }
    public static ArrayList<String> havebinary(int num, int input2) {
        ArrayList<String> chain1 = new ArrayList<String>();
        for (int i=0; i<num; i++) {
            chain1.add(toBinary(i, input2));
        }
        System.out.println(chain1);
        return chain1;
    }
    public static ArrayList<String> Duplicate(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!newList.contains(list.get(i))) {
                newList.add(list.get(i));
            }
        }
        

        return newList;
    }
    public static boolean compare(ArrayList<String> chain1, ArrayList<String> chain2) {
        boolean result = true;
        chain1.sort(null);
        chain2.sort(null);
        chain1 = Duplicate(chain1);
        
        for (int j=0; j<chain1.size(); j++) {
            if (!chain1.get(j).equals(chain2.get(j))) {
                result = false;
            }
        }
        
        return result;
    }
    
}

