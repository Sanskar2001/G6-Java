class DaemonExample {
    
    public static void main(String[] args) {
        
        ThreadA threadA=new ThreadA();
        threadA.setDaemon(true);
        threadA.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Thread mainThread=Thread.currentThread();
        // try {
        //     mainThread.join();
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }



        // int i=0;
        // while (true) {

        //     System.out.println("Main "+i);
        //     i++;
            
        // }
    }
}
