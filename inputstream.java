import java.io.FileInputStream;
import java.io.IOException;
public class inputstream {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("text1.txt");
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
            fis.close();
        }
        catch(IOException e){
            System.out.println("File not found: " + e.getMessage());
        }
    }
}