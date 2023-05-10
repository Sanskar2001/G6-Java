public class ThreadClient {
    
    public static void main(String[] args) {
        
        
        Thread thread=new Thread("T1");

        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getId());
        System.out.println(thread.threadId());
        System.out.println(thread.getState());


        MyThread myThread=new MyThread("T2");
        myThread.setName("Thread-2");
        myThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(myThread.isAlive());
        System.out.println(myThread.getName());
        System.out.println(myThread.getPriority());
        System.out.println(myThread.getId());
        System.out.println(myThread.threadId());
        System.out.println(myThread.getState());

        myThread.start();
        System.out.println(myThread.isAlive());
    }
}
