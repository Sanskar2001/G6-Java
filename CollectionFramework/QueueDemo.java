import java.util.*;;
class QueueDemo {
    

    public static void main(String[] args) {
        
        Queue<Integer>queue=new LinkedList<Integer>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.offer(100);

        queue.remove();
        queue.poll();

        System.out.println(queue);

    }
}
