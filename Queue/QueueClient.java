class QueueClient {

    
    public static void main(String[] args) {
         
        Queue queue=new Queue(3);

        try {

            queue.enQueue(1);
            queue.enQueue(2);
            queue.enQueue(3);
            queue.deQueue();
            queue.deQueue();
            queue.deQueue();
            queue.enQueue(10);
            queue.display();
        } catch (Exception e) {
            System.out.println(e);  
        }


        
       


    }

}
