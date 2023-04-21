class Engine
{
   private boolean isEngineOn;
    int rpm;
    private int currentRpm;
    int fuelEfficiency;
    int noOfPistons;
    static String manufacturer="Honda";

    public Engine(boolean isEngineOn,int currentRpm,int rpm,int fuelEfficiency,int noOfPistons)
    {

        this.isEngineOn=isEngineOn;
        this.rpm=rpm;
        this.fuelEfficiency=fuelEfficiency;
        this.noOfPistons=noOfPistons;

        System.out.println("Constructor called");
    }

    public Engine(boolean isEngineOn,int currentRpm,int noOfPistons)
    {
        this.isEngineOn=isEngineOn;
        this.currentRpm=currentRpm;
        this.noOfPistons=noOfPistons;
    }

    public Engine(boolean isEngineOn)
    {
        this.isEngineOn=isEngineOn;
    }

    void upgradeEngine(int noOfPistons)
    {
        this.noOfPistons=noOfPistons;
    }

    void upgradeEngine(int noOfPistons,int fuelEfficiency)
    {
        this.noOfPistons=noOfPistons;
        this.fuelEfficiency=fuelEfficiency;
    }

    void upgradeEngine(int noOfPistons,int fuelEfficiency,int rpm)
    {
        this.noOfPistons=noOfPistons;
        this.fuelEfficiency=fuelEfficiency;
        this.rpm=rpm;
    }

    void accelerate()
    {
        this.currentRpm+=200;
    }

    void setIsEngineOn(boolean isEngineOn)
    {
        this.isEngineOn=isEngineOn;
    }

    void setRpm(int rpm)
    {
        this.rpm=rpm;
    }

    void setfuelEfficiency(int fuelEfficiency)
    {
        this.fuelEfficiency=fuelEfficiency;
    }
    void setNoOfPistons(int noOfPistons)
    {
        this.noOfPistons=noOfPistons;
    }

    void setCurrentRpm(int currentRpm)
    {
        this.currentRpm=currentRpm;
    }

    boolean getEngineStatus()
    {
        return this.isEngineOn;
    }
    int getRpm()
    {
        return this.rpm;
    }

    int getFuelEfficiency()
    {
        return this.fuelEfficiency;
    }

    int getNoOfPistons()
    {
        return this.noOfPistons;
    }

    int getCurrentRpm()
    {
        return this.currentRpm;
    }

    String getManufacturer()
    {
        return this.manufacturer;
    }

    void setManufacturer(String manufacturer)
    {
        this.manufacturer=manufacturer;
    }

    static void printMessage()
    {
        System.out.println("Welcome to Honda! We are among the top manufacturers of Engines");
    }

}