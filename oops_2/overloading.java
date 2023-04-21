 class overloading {


    static int add(int x,int y)
    {
        return x+y;
    }

    static float add(float a,float b)
    {
        return a+b;
    }

    static int add(int a,int b,int c)
    {
        return a+b+c;
    }

    static float add(float x,float y,float z)
    {
        return x+y+z;
    }

    public static void main(String[] args) {
        

        int a=10,b=5;

        System.out.println(add(a, b));
        System.out.println(add(3.2f,0.8f));

        System.out.println(add(1,2,3));

        System.out.println(add(0.1f,0.9f,1.2f));
    }
    
}
