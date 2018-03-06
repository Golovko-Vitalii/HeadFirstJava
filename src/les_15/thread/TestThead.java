package les_15.thread;

public class TestThead {
    public static void main(String[] args){
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("Return to main method");
    }
}
class MyRunnable implements Runnable{
    public void run(){
        go();
    }
    void go(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ex){ex.printStackTrace();}
        doMore();
    }
    void doMore(){
        System.out.println("First in stack new Thread");
    }
}
