class ObjectDemo
{
    public static void main(String[] args) {
        

        int a=12;
        String str="Hello";

        Object obj1=123;
        Object obj2="XYZ";
        Object obj3='a';


        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);


        int [] arr=new int[3];


        Object[] myArr=new Object[3];

        myArr[0]=55;
        myArr[1]="Hi";
        myArr[2]='a';


    //     for(int i=0;i<3;i++)
    //    {
    //         String currElement= (String)myArr[i];
    //         System.out.println(currElement.charAt(0));
    //    }


      Container<String> container1=new Container<String>("Hello");
      container1.displayValue();

      Container<Integer> container2=new Container<Integer>(177);
      container2.displayValue();
    }
}