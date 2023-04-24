enum GunName
{
    AKM,M762,DP,M416,Groza,AUG,SCARL,Pan
}

class Gun
{
    private GunName gunName;
    private int ammo;
    private float calibre;
    private int damage;

    public Gun(GunName gunName,int ammo,float calibre,int damage)
    {
        this.gunName=gunName;
        this.ammo=ammo;
        this.calibre=calibre;
        this.damage=damage;

    }

    // void display()
    // {
    //     System.out.println("Gunname: "+gunName);
    //     System.out.println("Ammo: "+ammo);
    //     System.out.println("Calibre: "+calibre);
    //     System.out.println("Damage: "+damage);
    // }

    // setter
    void setAmmo(int ammo)
    {
        this.ammo=ammo;
    }
    
    void setCalibre(int calibre)
    {
        this.calibre=calibre;
    }
    void setDamage(int damage)
    {
        this.damage=damage;
    }
    //getter
    int getAmmo()
    {
        return this.ammo;
    }

    int  getDamage()
    {
        return this.damage;
    }
}

