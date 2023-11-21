package H4_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class H4_1_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("H4_1\\test.txt"));
        String line = br.readLine();
        br.close();
        int count = Integer.parseInt(line.split("\\.")[0]);
        count++;
        System.out.println(count);
        if (count >= 3) {
            System.out.println("已经到3次了");
            
        }else{
            System.out.println("还没到3次");
        }
        BufferedWriter bw = new BufferedWriter(new Buffe
        bw.write(count+"");
        bw.close();

    }
}
