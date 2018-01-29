package les_11.test_exception;

public class TestException {
    public static void main(String[] args){
        String test = "yes";
        for (int i = 0; i < 2; i++) {
            if (i==1) test = "no";
            try{
                System.out.println("Begin of try");
                doRisky(test);
                System.out.println("End of try");
            } catch(ScaryException ex){
                System.out.println("Scary exception");
            } finally{
                System.out.println("finally");
            }
            System.out.println("End of main");
        }
    }
    static void doRisky(String test) throws ScaryException{
        System.out.println("Begin of scary method");
        if("yes".equals(test)){
            throw new ScaryException();
        }
        System.out.println("End of scary method");
        return;
    }
}
