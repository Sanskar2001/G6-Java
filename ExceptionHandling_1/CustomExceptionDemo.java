class CustomExceptionDemo {
    
    static void proposeGirl(boolean girlAns) throws Exception
    {

        System.out.println("तेरी नजरों ने दिल का किया जो हशर असर ये हुआ अब इन में ही डूब के हो जाऊँ पार यही है दुआ");

        if(girlAns==false)
        throw new Exception("Flying chappal recieved!");

    }

    static void proposeGirl2(boolean girlAns) throws RejectionException
    {
        System.out.println("तेरी नजरों ने दिल का किया जो हशर असर ये हुआ अब इन में ही डूब के हो जाऊँ पार यही है दुआ");

        if(girlAns==false)
        throw new RejectionException();
    }
    


    public static void main(String[] args) {
        
    
            try{
                proposeGirl(false);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }


            try {
                proposeGirl2(false);
            } catch (Exception e) {
               System.out.println(e);
            }

         
        

      

    }
}
