import java.util.ArrayDeque;

class DequeDemo
{

    public static void main(String[] args) {
        

        ArrayDeque<Integer>deque=new ArrayDeque<Integer>();
        deque.add(10);
        deque.add(20);

       

        deque.addFirst(100);
        deque.addLast(200);


        deque.offerFirst(500);
        deque.offerLast(1000);
        System.out.println(deque);

    }
}