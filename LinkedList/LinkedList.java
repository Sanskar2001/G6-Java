class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
        next=null;
    }
}

class LinkedList
{
    Node head;


    void insertionAtHead(int data)
    {

        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    void deletionAtHead()
    {
        Node tmp=head;
        head=head.next;
        // disconnecting old head i.e. tmp from LL
        tmp.next=null;

    }
    void display()
    {
        Node tmp=head;

        while (tmp!=null) {
            
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }

    }

    void insertionAtKthPosition(int data,int k)
    {

        if(k==0)
        {
            insertionAtHead(data);
            return;
        }

        Node tmp=head;

        for(int i=1;i<=(k-1);i++)
        tmp=tmp.next;


        Node newNode=new Node(data);
        newNode.next=tmp.next;
        tmp.next=newNode;

    }


    void deletionAtKthPosition(int k)
    {
        if(k==0)
        {
            deletionAtHead();
            return;
        }


        Node tmp=head;

        for(int i=1;i<=(k-1);i++)
        tmp=tmp.next;

        Node nodeToBeDeleted=tmp.next;
        tmp.next=nodeToBeDeleted.next;
        nodeToBeDeleted.next=null;

    }

    
}