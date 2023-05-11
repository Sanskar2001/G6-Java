class DynamicArray {

    int []arr;
    int capacity;
    int size;

    public DynamicArray(int capacity)
    {
        this.capacity=capacity;
        this.arr=new int [capacity];
        size=0;
    }

    void add(int ele)
    {

        if(isFull())
        {
            // Array needs to grow it's size

            System.out.println("Array is incresing it'size ");

            int[] newBigArray=new int[2*capacity];

            int i;
            for( i=0;i<size;i++)
            newBigArray[i]=arr[i];

            newBigArray[i]=ele;

            arr=newBigArray;
            size++;
            capacity=2*capacity;

        }
        else{
        arr[size]=ele;
        size++;
        }
    }

    void display()
    {
        for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");
    }

    boolean isFull()
    {
        if(size==capacity)
        return true;

        return false;
    }

}
