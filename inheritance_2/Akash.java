class Akash extends Mukesh {

    int jio;
    int relianceTrends;

    public Akash()
    {

        System.out.println("Akash ambani is born");
        jio=0;
        relianceTrends=0;
        vimal=0;
        reliance=0;
        reliancePetroleum=0;
        relianceRetail=0;
    }

    void workHard()
    {
        System.out.println("Akash is working hard...");

        jio++;
        relianceTrends++;
        vimal++;
        reliance++;
        reliancePetroleum++;
        relianceRetail++;

    }


    int getNetworth()
    {

        System.out.println("Akash is checking bank balance");
        return jio+reliance+relianceTrends+reliancePetroleum+relianceRetail+vimal;
    }

    

    
}
