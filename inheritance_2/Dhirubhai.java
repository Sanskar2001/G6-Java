class Dhirubhai
{
    int vimal;
    int reliance;

    public Dhirubhai()
    {

        System.out.println("Dhirubhai Ambani is born");
        vimal=0;
        // you may or may not use this here
        this.reliance=0;
    }

    public Dhirubhai(int vimal,int reliance)
    {
        this.vimal=vimal;
        this.reliance=reliance;
    }

    void workHard()
    {
        vimal++;
        reliance++;
    }

    int getNetworth()
    {
        return vimal+reliance;
    }

}