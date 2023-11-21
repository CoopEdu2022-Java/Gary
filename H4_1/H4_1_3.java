package H4_1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class H4_1_3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("H4_1\\test.txt");
        StringBuilder sb = new StringBuilder();
        int len;
        while ((len = fr.read()) != -1) {
            System.out.println(len);
            sb.append((char) len);
        }
        fr.close();
        
        String str = sb.toString();
        String[] strs = str.split("-");
        ArrayList<Integer> arr = new ArrayList<>();
        for (String s : strs) {
            arr.add(Integer.parseInt(s));
        }

        Collections.sort(arr);
        // Integer[] arr = Arrays.stream(sb.toString()
        //         .split("-"))
        //         .map(Integer::parseInt)
        //         .sorted()
        //         .toArray(Integer[]::new);


        FileWriter fw = new FileWriter("H4_1\\test1.txt");
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                fw.write(arr.get(i) + "");
            } else {
                fw.write(arr.get(i) + "-");
            }
        }
        // String s= Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", "-");
        // fw.write(s);
        fw.close();
    }
}
//有bom头和有换行都会影响读取，这些数据都会被读取进来