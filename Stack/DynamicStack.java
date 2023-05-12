class DynamicStack extends Stack{
    

    public DynamicStack(int capacity)
    {
        super(capacity);
    }

    void push(int ele)
    {
        if(isFull())
        {

            System.out.println("The capacity is doubled!");
            int[] newBigArr=new int [2*capacity];


            for(int i=0;i<arr.length;i++)
            {
                newBigArr[i]=arr[i];
            }

            arr=newBigArr;
            capacity=2*capacity;
           arr[++top]=ele;
            
        }   

        else
        {
            arr[++top]=ele;
        }
    }

}
