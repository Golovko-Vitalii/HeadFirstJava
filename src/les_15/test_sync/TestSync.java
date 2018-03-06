package les_15.test_sync;

public class TestSync implements Runnable {
    private int balance;
    public void run(){
        for(int i=0;i<500000;i++){
            increment();
            System.out.println("Balance = "+balance);
        }
    }
    public void increment(){
        int i = balance;
        balance = i + 1;
    }
}
