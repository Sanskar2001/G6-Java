class Node
{
    int value;
    Node next;
    public Node(int value)
    {
        this.value=value;
        this.next=null;
    }
}


class LinkedListQPS
{

   static void display(Node head)
    {

        Node tmp=head;
        while(tmp!=null)
        {
            System.out.print(tmp.value+" ");
            tmp=tmp.next;
        }

    }

    static Node linkedListReverse(Node head)
    {

        Node curr=head;
        Node prev=null;

        while (curr!=null) {

            Node save=curr.next;
            curr.next=prev;
            prev=curr;
            curr=save;
            
        }
        head=prev;

        return head;

    }

    static Node reverseRecursive(Node head)
    {
        if(head==null || head.next==null)
        return head;

        Node sHead=reverseRecursive(head.next);
       
        Node tmp=sHead;

        while(tmp.next!=null)
        {
            tmp=tmp.next;
        }

        head.next=null;
        tmp.next=head;

        return sHead;

        
    }

    public static void main(String[] args) {
        

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);

    
        display(head);

        // head=linkedListReverse(head);

        head=reverseRecursive(head);

        System.out.println();
        display(head);

        // 1->2->3->4->NULL



    }
}