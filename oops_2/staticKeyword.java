class staticKeyword {
    
    static int a;
    static 
    {
        a=10;
        System.out.println("This is called even before main");
    }



     void fun()
    {
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        
        staticKeyword obj=new staticKeyword();

        obj.fun();
        System.out.println(a);
    }
}
