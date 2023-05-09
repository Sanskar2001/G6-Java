class ThreadUsingRunnable implements Runnable
{

    @Override
    public void run() {
        
        int i=0;
        while (true) {

            System.out.println("Ironman "+i);
            i++;
            
        }
        
    }
    
}
