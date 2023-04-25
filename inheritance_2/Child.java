class Child extends Parent
{

    int c;

    public Child()
    {
        c=0;
       // a=0; This is a private data member can't be inherited
        b=0;
    }

}