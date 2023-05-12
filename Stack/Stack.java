class Stack
{
    protected int []arr;
    protected int capacity;
    protected int top;

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


    void push(int ele) throws StackOverflowException
    {
        if(isFull())
        {
            // throw new Exception("Stack Overflow!!");

            throw new StackOverflowException();
        }

        top++;
        arr[top]=ele;
    }
    
    int peek() throws StackEmptyException
    {
        if(isEmpty())
        {
        //    throw new Exception("Stack is Empty!!");  
           throw new StackEmptyException();
        }
   

        return arr[top];
    }

    int pop() throws StackEmptyException
    {
        if(isEmpty())
        throw new StackEmptyException();

        return arr[top--];
    }


    void display() throws StackEmptyException
    {
        if(isEmpty())
        throw new StackEmptyException();

        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }



}