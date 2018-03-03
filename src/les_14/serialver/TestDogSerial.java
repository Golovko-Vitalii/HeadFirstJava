package les_14.serialver;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestDogSerial {
    public static void main(String[] args){
        Dog dog = new Dog("fido", 8);
        try{
            ObjectOutputStream  oos = new ObjectOutputStream(new FileOutputStream("Dog.ser"));
            oos.writeObject(dog);
            oos.close();
        }catch(Exception ex){ex.printStackTrace();}
    }
}
