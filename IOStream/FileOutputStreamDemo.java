import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    

    public static void main(String[] args) {
        
        try { 
            

            FileOutputStream fos=new FileOutputStream("/Users/sanskaratrey/Documents/G6-Java/IOStream/sample.txt",true);
            // fos.write(97);
            fos.write("Output stream is working".getBytes());
            fos.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
