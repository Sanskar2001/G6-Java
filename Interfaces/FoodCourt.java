class FoodCourt {

    public static void main(String[] args) {
         
        Restraunt restraunt=new Restraunt();
        
        restraunt.hireStaff();
        restraunt.bake();
        restraunt.bake();
        restraunt.sellPizzas();
        restraunt.sellPizzas();



        Dominos restraunt2=new Restraunt();
        restraunt2.hireStaff();
        restraunt2.bake();
        restraunt2.fireStaff();


        OvenStory ovenStoryRestaurant=new OvenStoryRestaurant();
        
        ovenStoryRestaurant.hireStaff();
        ovenStoryRestaurant.bake();
        ovenStoryRestaurant.sellPizzas();
        ovenStoryRestaurant.sellSides();
        ovenStoryRestaurant.fireStaff();
    }
    
}
