class Main {
    

    static Node getKthFromLast(Node head,int k)
    {
        Node slow=head;
        Node fast=head;

        for(int i=1;i<=k;i++)
        fast=fast.next;

        while (fast!=null) {
            
            fast=fast.next;
            slow=slow.next;
        }

        return slow;

    }

    static Node getMidNode(Node head)
    {
     
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }


        return slow;
    }


    public static void main(String[] args) {
        

        LinkedList ll=new LinkedList();

        ll.insertionAtHead(10);
        ll.insertionAtHead(20);
        ll.insertionAtHead(30);
        ll.insertionAtHead(40);
        ll.insertionAtHead(50);

        ll.insertionAtKthPosition(100, 2);

        // ll.deletionAtHead();
        ll.deletionAtKthPosition(0);

        ll.display();
        System.out.println();
        System.out.println(ll.getNodeValue(2));
        

        System.out.println(getKthFromLast(ll.head, 2).data);

        Node midNode=getMidNode(ll.head);
        System.out.println(midNode.data);

        // System.out.println("Length of LL= "+ll.length());

        // 50->40->30->20->10->null

        // 50->40->100->30->20->10->null

    }
}
