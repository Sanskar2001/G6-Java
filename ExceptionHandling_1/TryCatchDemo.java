import java.io.*;
class TryCatchDemo {


    public static void main(String[] args) {
        
        try{
            int c=10/5;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Flow will always reach here");
        }



        // try{
        //     int z=55/0;
        //     File file = new File("filename.txt");
        //     FileInputStream fis = new FileInputStream(file);
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }

        // try{
        //     int z=55/2;
        //     File file = new File("filename.txt");
        //     FileInputStream fis = new FileInputStream(file);
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }

        // try{
        //     int z=55/2;
        //     File file = new File("filename.txt");
        //     FileInputStream fis = new FileInputStream(file);
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println(e);
        // }
        // catch(FileNotFoundException e)
        // {
        //     // System.out.println("Flow is in this catch");

        //     System.out.println(e.getMessage());
        //     e.printStackTrace();
        // }



        // nested try catch
        try{
            int z=55/0;
         
        
            File file = new File("filename.txt");
            try{
                FileInputStream fis = new FileInputStream(file);
            }
            catch(FileNotFoundException e)
            {
                System.out.println(e);
            }
            
            
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
       



       
       


        
    }
}
