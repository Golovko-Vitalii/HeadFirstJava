package les_04.dog;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        Dog two = new Dog();
        Dog three = new Dog();
        one.size = 70;
        two.size = 8;
        three.size = 35;
        one.bark(3);
        two.bark(2);
        three.bark(1);

    }
}
