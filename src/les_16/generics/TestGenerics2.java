package les_16.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics2 {
    public static void main(String[]args){
        new TestGenerics2().go();
    }
    public void go(){
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Dog());
        takeAnimals(animals);
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        takeAnimals(dogs);
        ///Ex_2
        //ArrayList<Dog> dogs1 = new ArrayList<Animal>();
        //ArrayList<Animal> animals1 = new ArrayList<Dog>();
        List<Animal>list = new ArrayList<Animal>();
        ArrayList<Dog>dogs3 = new ArrayList<Dog>();
        //ArrayList<Animal> animal = dogs3;
        List<Dog> dogList = dogs3;
        ArrayList<Object> objects = new ArrayList<Object>();
        List<Object> objList = objects;
        //ArrayList<Object> objs = new ArrayList<Dog>();
    }
    public void takeAnimals(ArrayList<? extends Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
        //animals.add(new Cat());
        System.out.println(animals);
    }
    public <T extends Animal> void takeThing1(ArrayList<T> one, ArrayList<T> two){

    }
    public void takeThing2(ArrayList<? extends Animal> one, ArrayList<? extends Animal> two){

    }
}
