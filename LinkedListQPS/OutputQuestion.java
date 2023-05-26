class Container
{
    int value;
    String name;

    public Container(int value,String name)
    {
        this.value=value;
        this.name=name;
    }
}

class OutputQuestion {

    static void changeContainerObject(Container obj)
    {
       obj=new Container(600, "Tank");
    }


    public static void main(String[] args) {


        Container container=new Container(50, "Bucket");

        changeContainerObject(container);

        System.out.println(container.name+" "+container.value);
    }
}
