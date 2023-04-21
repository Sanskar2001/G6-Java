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


      // System.out.println(engine.getEngineStatus());
      // System.out.println(engine.getRpm());
      // System.out.println(engine.getFuelEfficiency());
      // System.out.println(engine.getNoOfPistons());

      //   engine.accelerate();

      //   System.out.println(engine.getCurrentRpm());

      //   engine.accelerate();
        
      //   System.out.println(engine.getCurrentRpm());



      System.out.println(engine.getNoOfPistons());

      engine.upgradeEngine(8);
      System.out.println(engine.getNoOfPistons());
      
      engine.upgradeEngine(10, 15, 6000);

      System.out.println(engine.getNoOfPistons());
      System.out.println(engine.getFuelEfficiency());
      System.out.println(engine.getRpm());



      Engine engine2=new Engine(false, 0, 4000, 12, 4);
      Engine engine3=new Engine(false, 0, 5000, 11, 5);



      // System.out.println(engine.getManufacturer());
      // System.out.println(engine2.getManufacturer());
      // System.out.println(engine3.getManufacturer());


      System.out.println(Engine.manufacturer);



      Engine.printMessage();

      Engine engine4=new Engine(false,0,6);

      // noofPistons
      //isEngineOn
      // currentRpm

      System.out.println(engine4.getEngineStatus());
      System.out.println(engine4.noOfPistons);
      System.out.println(engine4.getCurrentRpm());

      Engine engine5=new Engine(false);

      System.out.println(engine5.getEngineStatus());

    }         
}
