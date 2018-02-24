package les_12;

public class MyOuterClass {
    private int x;

    MyInnerClass inner = new MyInnerClass();

    public void doStuff(){
        inner.go();
    }

    class MyInnerClass {
        void go(){
            x = 42;
        }
    }
}
