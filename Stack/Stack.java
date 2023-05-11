class Stack
{
    int []arr;
    int capacity;
    int top;

    public Stack(int capacity)
    {
        this.capacity=capacity;
        this.arr=new int[capacity];
        this.top=-1;
    }

    boolean isFull()
    {
        if(top==capacity-1)
        return true;

        return false;
    }

    boolean isEmpty()
    {
        if(top==-1)
        return true;

        return false;
    }


    void push(int ele)
    {
     
    }
    

}