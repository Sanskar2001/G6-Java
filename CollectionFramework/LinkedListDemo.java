import java.util.LinkedList;

class LinkedListDemo
{
    public static void main(String[] args) {
        

        LinkedList<Integer>ll=new LinkedList<Integer>();
        ll.add(1);
        // ll.add(2);
        // ll.add(3);


        // ll.addFirst(10);
        // ll.addLast(25);

        ll.remove();
        // ll.remove();

        System.out.println( ll.poll());



        for(int i=0;i<ll.size();i++)
        System.out.println(ll.get(i));



    }
}