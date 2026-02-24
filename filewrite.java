import java.io.FileWriter;
import java.io.IOException;
public class filewrite {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("text1.txt");
            String data = "Hello, this file is updated twice.";
            fw.write(data);
            fw.close();
            System.out.println("Data written to file successfully.");
        }catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}