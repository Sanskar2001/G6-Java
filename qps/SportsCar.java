class SportsCar extends Car{
    
    int seatingCapacity;
    int noofDoors;

    public SportsCar()
    {
        noofDoors=2;
        // enginePollutionLevel=6; Cannot re assign value to it 
    }

    void getNoofDoors()
    {
        System.out.print("No of doors="+super.noofDoors);
    }
}
 