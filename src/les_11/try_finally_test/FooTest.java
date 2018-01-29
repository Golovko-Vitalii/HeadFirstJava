package les_11.try_finally_test;

public class FooTest {
    public static void main(String[] args) throws MyException{
        System.out.println("method main begin");
        Foo f = new Foo();
        f.gogo();
        System.out.println("method main end");
    }
}
