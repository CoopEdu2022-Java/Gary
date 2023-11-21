package H4_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class H4_1_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("H4_1\\test.txt"));
        String line;
        List<String> list = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                int num1 = Integer.parseInt(o1.split("\\.")[0]);
                int num2 = Integer.parseInt(o2.split("\\.")[0]);
                return num1 - num2;
            }
        });
        BufferedWriter bw = new BufferedWriter(new FileWriter("H4_1\\test1.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
