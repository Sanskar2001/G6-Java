abstract class Android
{
    int linuxKernelVersion;
    int androidVersion;
    // void renderUI()
    // {
    //     System.out.println("Displaying Stock Android");
    // }


    // Provided  an abstract method instead of concrete implementation
    abstract void renderUI();

    void getDetails()
    {
        System.out.println(linuxKernelVersion);
        System.out.println(androidVersion);
    }
}