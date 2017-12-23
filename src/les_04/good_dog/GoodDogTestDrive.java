package les_04.good_dog;

public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        GoodDog two = new GoodDog();
        GoodDog three = new GoodDog();
        one.setSize(70);
        two.setSize(8);
        three.setSize(35);
        System.out.println("Первая собака: " + one.getSize());
        System.out.println("Вторая собака: " + two.getSize());
        System.out.println("Третья собака: " + three.getSize());
        one.bark(1);
        two.bark(1);
        three.bark(1);

    }
}
