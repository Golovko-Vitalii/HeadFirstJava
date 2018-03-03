package les_14.serialver;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDogDeserial {
    public static void main (String[] args){
        try{
            Dog dogRestore = (Dog)(new ObjectInputStream(new FileInputStream("Dog.ser"))).readObject();
            System.out.println(dogRestore.dogToString());
        }catch(Exception ex){ex.printStackTrace();}
    }
}
