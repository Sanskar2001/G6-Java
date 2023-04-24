class Dhirubhai
{
    int vimal;
    int reliance;

    public Dhirubhai()
    {
        System.out.println("Dhirubhai Ambani is born");
        vimal=0;
        reliance=0;
    }

    public int getNetworth()
    {
        return vimal+reliance;
    }

    public void workHard()
    {
        vimal++;
        reliance++;
    }


    // getters
    public int getVimal()
    {
        return vimal;
    }

    public int getReliance()
    {
        return reliance;
    }
}