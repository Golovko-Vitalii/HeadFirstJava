package les_06.ex_1;

public class Test {
    private boolean flag = false;
    private boolean changeFlag(){
        flag = true;
        return flag;
    }
    public static void main(String [] args){
        Test newTest = new Test();
        System.out.println("First attempt:");
        if (newTest != null && newTest.changeFlag()){
            System.out.println("Flag is true!");
        } else {
            System.out.println("Object newTest is NULL");
        }
        System.out.println("Second attempt:");
        newTest = null;
        if (newTest != null && newTest.changeFlag()){
            System.out.println("Flag is true!");
        } else {
            System.out.println("Object newTest is NULL");
        }
        System.out.println("Third attempt:");
        newTest.changeFlag(); //NullPointerException
    }
}
