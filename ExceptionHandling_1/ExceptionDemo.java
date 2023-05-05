import java.io.*;
class ExceptionDemo
{
    public static void main(String[] args) {
        
        int a=10,b=0;

        

        try {
            int c=a/b;
            
        } catch (Exception e) {
           System.out.println(e);
        }

       

              File file = new File("filename.txt"); // replace with your file name

              try {
                FileInputStream fis = new FileInputStream(file);
              } catch (Exception e) {
                System.out.println(e);
              }

              System.out.println("Program flow is reaching here");
             

    }
}