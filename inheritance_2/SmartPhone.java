enum Os
{
    Android,ios;
}
class SmartPhone extends Phone {
    
    Os os;

    public SmartPhone(Os os)
    {
        screenSize=10;
        ram=8;
        this.os=os;
    }


    void capturePhoto()
    {
        System.out.println("Capturing photo....");
    }

    void call()
    {
        System.out.println("Calling using voice over LTE");
    }


}
