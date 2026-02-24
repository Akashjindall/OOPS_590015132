
 import java.io.FileOutputStream;
import java.io.IOException;
public class updatefile {
 public static void main(String[] args) {
    try{
        FileOutputStream fos = new FileOutputStream("text1.txt", true);
        String updatedData = " Akash jindal ";
        fos.write(updatedData.getBytes());
        fos.close();
        System.out.println("Data written to file successfully.");
    } catch (IOException e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
 }   
}   
