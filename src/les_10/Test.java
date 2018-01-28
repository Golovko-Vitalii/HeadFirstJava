package les_10;

public class Test {
    public static void main(String[] args){
        Math mathObject;
        //mathObject = new Math();
        Math.min(42,36);
        //mathObject.min(42,36);
        Test.min(42,36);
    }
    public static int min(int a, int b){
        return 0;
    }
}
