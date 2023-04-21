class Engine
{
   private boolean isEngineOn;
    int rpm;
    private int currentRpm;
    int fuelEfficiency;
    int noOfPistons;

    public Engine(boolean isEngineOn,int currentRpm,int rpm,int fuelEfficiency,int noOfPistons)
    {

        this.isEngineOn=isEngineOn;
        this.rpm=rpm;
        this.fuelEfficiency=fuelEfficiency;
        this.noOfPistons=noOfPistons;

        System.out.println("Constructor called");
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


}