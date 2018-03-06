package les_15.ryan_and_monica;

public class RyanAndMonicaJob implements Runnable {
    private BankAccount account = new BankAccount();
    public static void main(String[] args){
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }
    public void run(){
        for(int x=0;x<10;x++){
            makeWithdrawl(10);
            //System.out.println(account.getBalance());
            if(account.getBalance()<0){
                System.out.println("Exceeding the limit!");
            }
        }
    }
    private synchronized void makeWithdrawl(int amount){
        if(account.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName()+" is going to withdraw money");
            try{
                System.out.println(Thread.currentThread().getName()+" is going sleep");
                Thread.sleep(500);
            }catch(InterruptedException ex){ex.printStackTrace();}
            System.out.println(Thread.currentThread().getName()+" awaked up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+" finished transaction");
        } else{
            System.out.println("Sorry, but for client "+Thread.currentThread().getName()+" not enough money");
        }
    }
}
