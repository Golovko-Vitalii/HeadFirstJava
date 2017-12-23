package les_04.poor_dog;

public class PoorDogTestDrive {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("Размер собаки - " + one.getSize());
        System.out.println("Имя собаки - " + one.getName());
        String a = "ab";
        String b = new String("ab");
        System.out.println(a==b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        short c1 =7;
        long c2 = 7;
        System.out.println(calc(c1,2));
        System.out.println(calc((int)c2,2));
        //byte h = calc(4,20);
        calc(2,1);
    }
    static int calc (int a, int b){
        return a+b;
    }
}
