
import java.io.FileOutputStream;
import java.io.IOException;
public class outputstream {
 public static void main(String[] args) {
    try{
        FileOutputStream fos = new FileOutputStream("text1.txt");
        String data = "Hello, this is a test.";
        fos.write(data.getBytes());
        fos.close();
        System.out.println("Data written to file successfully.");
    } catch (IOException e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
 }   
}
