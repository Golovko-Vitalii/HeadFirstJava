package les_08.animal;

import java.util.ArrayList;

public class AnimalTestDrive {
    public static void main (String[] args){
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        list.add(a);
        list.add(c);
        if(a.equals(c)){
            System.out.println("a is equal c");
        } else {
            System.out.println("a is not equal c");
        }
        System.out.println(c.getClass());
        System.out.println(c.hashCode());
        System.out.println(c.toString());
        ArrayList<Object> myDogArrayList = new ArrayList<Object>();
        myDogArrayList.add(a);
        if(myDogArrayList.get(0) instanceof Dog){
            Dog d = (Dog)myDogArrayList.get(0);Dog sameDog = (Dog)getObject(d);
            Object sameDoga = getObject(d);

        }
    }
    public static Object getObject(Object o){
        return o;
    }
}
