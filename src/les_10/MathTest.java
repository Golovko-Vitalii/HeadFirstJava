package les_10;

public class MathTest {
    public static void main(String[] args){
        double r1 = Math.random();
        int r2 = (int)(Math.random()*5);
        System.out.println(r2);
        System.out.println((int)2.2);
        System.out.println((int)2.8);
        int x = Math.abs(-240);
        System.out.println(x);
        double d = Math.abs(240.45);
        System.out.println(d);
        int x1 = Math.round(-24.8f);
        System.out.println(x1);
        int x2 = Math.round(24.45f);
        System.out.println(x2);
        int x3 = Math.min(24,240);
        System.out.println(x3);
        double x4 = Math.min(90876.5, 90876.49);
        System.out.println(x4);
        int x5 = Math.max(24,240);
        System.out.println(x5);
        double x6 = Math.max(90876.5, 90876.49);
        System.out.println(x6);
        int i = 288;
        Integer iWrap = new Integer(i);
        int unWrapped = iWrap.intValue();
        System.out.println(unWrapped);
        Integer i1 = new Integer(42);
        i1++;
        Integer k = i1+3;
        String s = "2";
        int xx = Integer.parseInt(s);
        Double dd = Double.parseDouble("420.24");
        boolean b = new Boolean("true").booleanValue();
        String t = "two";
        //int yy = Integer.parseInt(t);
        double d3 = 42.5;
        String doubleString = "" + d;
        System.out.println(doubleString);
        String doubleString2 = Double.toString(d);
        System.out.println(doubleString2);
    }
}
