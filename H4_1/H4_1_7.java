package H4_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class H4_1_7 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("H4_1\\test.txt"));
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }
        ois.close();
    }
}
