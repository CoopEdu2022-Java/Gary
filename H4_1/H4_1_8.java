package H4_1;


import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URLConnection;


public class H4_1_8 implements Runnable {
    private String url;
    private String path;
    H4_1_8(String url, String path) {
        this.url = url;
        this.path = path;
    }
    @Override
    public void run() {
        Downloader f = new Downloader();
        f.download(url, path);
    }
    public static void main(String[] args) {
        String url = "https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/242px-Java_programming_language_logo.svg.png";
        
        H4_1_8 t1 = new H4_1_8(url, "java1.png");
        H4_1_8 t2 = new H4_1_8(url, "java2.png");
        H4_1_8 t3 = new H4_1_8(url, "java3.png");
        Thread t = new Thread(t1);
        Thread t0 = new Thread(t2);
        Thread t00 = new Thread(t3);
        t.start();
        t0.start();
        t00.start();
    }
}
class Downloader {
    public void download(String url, String path) {
        try {
            URLConnection connection = URI.create(url).toURL().openConnection();
            BufferedInputStream inputStream = new BufferedInputStream(connection.getInputStream());
            FileOutputStream outputStream = new FileOutputStream(path);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            outputStream.close();
            inputStream.close();
            System.out.println(path + " Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}