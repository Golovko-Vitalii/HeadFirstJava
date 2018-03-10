package les_18.extra;

public class TestBlock {
    public static void main(String[] args){
        new TestBlock().doStuff();
        StringBuffer sb = new StringBuffer("spring");
        System.out.println(sb.delete(3,6));
        System.out.println(sb.insert(2,"umme"));
        System.out.println(sb.deleteCharAt(1));
        // or
        // sb = sb.delete(3,6).insert(2,"umme").deleteCharAt(1);
        System.out.println("sb = " + sb);
    }
    void doStuff(){
        int x = 0;
        for (int y = 0; y < 5; y++) {
            x+=y;
        }
        //x=x*y;
    }
}
