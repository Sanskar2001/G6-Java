class myclass
{
    int x;
}

class NullPointerExceptionDemo {
    
    public static void main(String[] args) {
        
       
        myclass obj=null;

        try
        {
            System.out.println(obj.x);
        }
        catch(NullPointerException e)
        {
           
            System.out.println(e);
        }

      
      




        System.out.println("Here");
     
    }
}
