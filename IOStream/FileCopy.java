import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class FileCopy {

    public static void main(String[] args) {
        
        try {
            FileInputStream fis=new FileInputStream("/Users/sanskaratrey/Documents/G6-Java/IOStream/sample.txt");
            FileOutputStream fos=new FileOutputStream("/Users/sanskaratrey/Documents/G6-Java/IOStream/destination.txt");


            byte[] arr=new byte[fis.available()];
            fis.read(arr);
            fos.write(arr);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
