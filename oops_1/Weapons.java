class Gun
{
    private String gunName;
    private int ammo;
    private float calibre;
    private int damage;

    public Gun(String gunName,int ammo,float calibre,int damage)
    {
        this.gunName=gunName;
        this.ammo=ammo;
        this.calibre=calibre;
        this.damage=damage;

    }

    void display()
    {
        System.out.println("Gunname: "+gunName);
        System.out.println("Ammo: "+ammo);
        System.out.println("Calibre: "+calibre);
        System.out.println("Damage: "+damage);
    }

    // setter
    void setAmmo(int ammo)
    {
        this.ammo=ammo;
    }
    
    void setCalibre(int calibre)
    {
        this.calibre=calibre;
    }

    //getter
    int getAmmo()
    {
        return this.ammo;
    }
}

class Weapons
{
    public static void main(String[] args) {
        
        Gun g1=new Gun("AKM", 60, 7.62f, 60);

        System.out.println(g1.hashCode());
        g1.display();
        g1.setAmmo(160);
        System.out.println(g1.getAmmo());


    }
}