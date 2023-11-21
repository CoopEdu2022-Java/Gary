package H4_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class H4_1_5_1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("H4_1\\test.txt"));
        String line;
        TreeMap<Integer, String> tm = new TreeMap<>();
        while((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]), arr[1]);
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("H4_1\\test1.txt"));
        Set<Map.Entry<Integer,String>> enries = tm.entrySet();  
        for (Map.Entry<Integer, String> entry : enries) {
            bw.write(entry.getKey() + "." + entry.getValue());
            bw.newLine();
        }
        bw.close();
    }
}
