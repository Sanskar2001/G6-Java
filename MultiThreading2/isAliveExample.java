
class MyThread extends Thread{

    public void run()
    {
        System.out.println("This is my thread");
    }
}

class isAliveExample {
    

    public static void main(String[] args) {
        
        MyThread myThread=new MyThread();
        System.out.println(myThread.isAlive());
        myThread.start();
        System.out.println(myThread.isAlive());
    }
}
