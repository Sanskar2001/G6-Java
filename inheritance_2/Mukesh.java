class Mukesh extends Dhirubhai {


    int reliancePetroleum;
    int relianceRetail;


    public Mukesh()
    {

        super(10,10);
        reliancePetroleum=0;
        relianceRetail=0;
        System.out.println("Mukesh Ambani is born");

    }

    void workHard()
    {
        System.out.println("Mukesh is working hard...");
        vimal++;
        reliance++;
        reliancePetroleum++;
        relianceRetail++;
    }

    int getNetworth()
    {   
        System.out.println("Mukesh is checking bank balance...");
        return vimal+reliance+reliancePetroleum+relianceRetail;
    }
    
}
