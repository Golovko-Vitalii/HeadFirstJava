package les_18.extra;

public class TestInner {
    public static void main(String[] args) {
        FooOuter.BarInner foo = new FooOuter.BarInner();
        foo.sayIt();
    }
}
