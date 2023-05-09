class ConcurrencyExample {
    

    public static void main(String[] args) {
        

        int n=100;
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println("Avengers");
        // }

        // Way 1
        // 1. Create a class that extends Thread Class
        // 2.Override the run method inside this newly created class 
        //  and write everything that needs to 
        //  executed in a separate thread
        // 3. Create an object of this class
        // 4. fire start method on object of this class
        MyThread thread=new MyThread();
        thread.start();

        // Way2
        // 1. Create a class that implements the runnable interface
        // 2. Implement the run function inside this newly created class 
        //  and write everything that needs to 
        //  executed in a separate thread
        // 3. Create an object of this class
        // 4. Create a thread using the object created in step 3
        // 5. fire start method on this newly created thread

        ThreadUsingRunnable threadUsingRunnable=new ThreadUsingRunnable();

        Thread thread2=new Thread(threadUsingRunnable);

        thread2.start();

            int i=0;
      
            while(true)
            {
                System.out.println("Assemble "+i);
                i++;
            }
          
    
    }
}
