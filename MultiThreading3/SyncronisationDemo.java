class MyPrinter {
    //    public void display(String str) {
    //
    //        synchronized (this) {
    //            for (int i = 0; i < str.length(); i++)
    //                System.out.print(str.charAt(i));
    //        }
    //    }
           synchronized public void display(String str) {
    
                for (int i = 0; i < str.length(); i++)
                    System.out.print(str.charAt(i));
    
        }
    
    }
    class ThreadX extends Thread
    {
        MyPrinter printer;
        public ThreadX(MyPrinter printer)
        {
            this.printer=printer;
        }
    
        @Override
        public void run() {
    
            printer.display("ThisIsABigSentence");
        }
    }
    class ThreadY extends Thread
    {
        MyPrinter printer;
    
        public  ThreadY(MyPrinter printer)
        {
            this.printer=printer;
        }
    
        @Override
        public void run() {
    
            printer.display("World");
        }
    }
    
    
    public class SyncronisationDemo {
    
        public static void main(String[] args) {
            MyPrinter printer=new MyPrinter();
    
            ThreadX threadX=new ThreadX(printer);
            ThreadY threadY=new ThreadY(printer);
    
            threadX.start();
            threadY.start();
    
        }
    }
    