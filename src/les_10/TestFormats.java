package les_10;

public class TestFormats {
    public static void main(String[] args){
        String s = String.format("%,d", 1000000000);
        System.out.println(s);
        s = String.format("Мне нужно исправить %.2f ошибки", 476578.09876);
        System.out.println(s);
        s = String.format("Мне нужно исправить %,.2f ошибки", 476578.09876);
        System.out.println(s);
        s = String.format("Мне нужно исправить %,.2f, ошибки", 476578.09876);
        System.out.println(s);
        s = String.format("%,60.1f", 42.000);
        System.out.println(s);
        System.out.println(String.format("%d", 42));
        System.out.println(String.format("%.3f",42.000000));
        System.out.println(String.format("%x", 42));
        System.out.println(String.format("%c", 42));
        int one = 20456654;
        double two = 100567890.248907;
        s = String.format("Уровень %d из %,.2f", one, two);
        System.out.println(s);
    }
}
