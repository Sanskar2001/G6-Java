class engineClient {
    

    public static void main(String[] args) {

        Engine engine=new Engine(false,0, 5000, 10, 5);
        

        // engine.setIsEngineOn(true);
        // // System.out.println(engine.noOfPistons);
        // // System.out.println(engine.rpm);
        // // System.out.println(engine.fuelEfficiency);


        // System.out.println(engine.getEngineStatus());

        // engine.setIsEngineOn(false);

        // System.out.println(engine.getEngineStatus());


      System.out.println(engine.getEngineStatus());
      System.out.println(engine.getRpm());
      System.out.println(engine.getFuelEfficiency());
      System.out.println(engine.getNoOfPistons());

        engine.accelerate();

        System.out.println(engine.getCurrentRpm());

        engine.accelerate();
        
        System.out.println(engine.getCurrentRpm());
      



    }         
}
