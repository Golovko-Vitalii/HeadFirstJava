package les_15.thread;

public class RunThreads implements Runnable {
    int ind = 0;
    public static void main(String[] args){
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("thread alpha");
        beta.setName("thread beta");
        alpha.start();
        beta.start();
    }
    public void run(){
        for(int i=0; i<10000;i++){
            String threadName = Thread.currentThread().getName();
            System.out.println("index = "+ (++ind)+ ", "+"i = "+i+", "+"Now is working "+threadName);
        }
    }
}
