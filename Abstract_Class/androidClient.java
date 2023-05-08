public class androidClient {
    
    
    public static void main(String[] args) 
    {
        MiUi xiaomiPhone=new MiUi();
        OxygenOs onePlusPhone=new OxygenOs();


        //abstract class reference can refer to object to sub class
        Android phone1=new MiUi();
        Android phone2=new OxygenOs();
    

    }
}
