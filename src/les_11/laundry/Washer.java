package les_11.laundry;

public class Washer {
    Laundry laundry = new Laundry();
    public void go(){
        try{
            laundry.doLaundry();
        } catch(TeeShirtException tex) {
            // for TeeShirtExceptions
        } catch(LingerieException lex) {
            // for LingerieExceptions
        } catch(ClosingException cex){
            // for all others ClosingExceptions
        }
    }
    public void foo() throws ClosingException{
        laundry.doLaundry();
    }
    public static void main(String[] args) throws ClosingException {
        Washer a = new Washer();
        a.foo();
    }
}
