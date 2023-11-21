package H4_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class H4_1_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\test\\test.txt");
        FileOutputStream fos = new FileOutputStream("D:\\test\\test1.txt");
        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        fos.close();
        fis.close();
        

    }
}
