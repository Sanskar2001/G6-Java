class objectDemo
{
    static void incrementValue(int a)
    {
        ++a;
    }

    static void func(int []arr)
    {
        arr[0]=500;
    }

    static void changeSem(Student s)
    {
        s.sem++;
    }

    public static void main(String[] args) {
        int a=10;
        
        incrementValue(a);
        System.out.println(a);

        int arr[]={1,2,3};

        func(arr);

        for(int ele:arr)
       System.out.println(ele+" ");

        Student s=new Student(101, 4);
        changeSem(s);
        s.printDetails();

    
    }
}