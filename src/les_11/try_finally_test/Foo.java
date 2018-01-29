package les_11.try_finally_test;

public class Foo {
    public void go() throws MyException{
        System.out.println("method go before throw exception");
        throw new MyException();
    }
    public void gogo() throws MyException{
        try{
            System.out.println("method gogo before go()");
            go();
            System.out.println("method gogo after go()");
        } finally{
            System.out.println("method gogo block finally without catch");
        }
    }
}
