class Queue
{
    int []arr;
    int front;
    int rear;

    public Queue(int capacity)
    {
        arr=new int[capacity];
        front=-1;
        rear=-1;

    }

    boolean isEmpty()
    {
        if(front==-1 && rear==-1)
        return true;

        return false;
    }


    boolean isFull()
    {
        if(rear==arr.length-1)
        return true;

        return false;
    }


    void enQueue(int ele) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Queue is full can't enQueue");
        }

        if(isEmpty())
        {
            front++;
            rear++;
            arr[rear]=ele;
            return;
        }

        arr[++rear]=ele;

    }

    int deQueue() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is Empty!");
        }

        int deletedElement=arr[front];
        front++; // deletion

        if(front>rear)
        {
            front=-1;
            rear=-1;
        }

        return deletedElement;
    }


    int getFront() throws Exception
    {

        if(isEmpty())
        {
            throw new Exception("Queue is Empty!!");
        }
        return arr[front];
    }


    void display() throws Exception
    {

        if(isEmpty())
        throw new Exception("Queue is Empty");

        for(int i=front;i<=rear;i++)
        {
            System.out.println(arr[i]);
        }
    }

    
}