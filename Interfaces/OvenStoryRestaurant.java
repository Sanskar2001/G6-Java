class OvenStoryRestaurant implements OvenStory {

    @Override
    public void bake() {
        System.out.println("OvenStory baking bread");
    }

    @Override
    public void hireStaff() {

        System.out.println("Hiring staff");
        
    }

    @Override
    public void fireStaff() {
       System.out.println("Firing Staff");
    }

    @Override
    public void sellPizzas() {

        System.out.println("selling pizzas");
       
    }

    @Override
    public void sellSides() {
        System.out.println("Selling sides");
    }


    
}
