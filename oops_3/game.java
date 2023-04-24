class game {
    

    public static void main(String[] args) {
        
        Gun g1=new Gun(GunName.AKM, 60, 7.62f, 50);
        Gun g2=new Gun(GunName.Groza,30,7.62f,60);


        Player p1=new Player(1, 0, g1, false, false);
        Player p2=new Player(2);
        Player p3=new Player(3);

        p1.attack(p2);
        System.out.println("Health of p2="+p2.getHealth());

        
        p1.pickUpGun(g2);

        p1.attack(p2);
        System.out.println("Health of p2="+p2.getHealth());

        p3.revive(p2);
        System.out.println("Health of p2="+p2.getHealth());
        
    }
}
