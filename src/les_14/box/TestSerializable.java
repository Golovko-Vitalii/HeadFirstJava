package les_14.box;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class TestSerializable {
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("TestSerializable.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //oos.writeObject(new Object());//class Object isn't serializable
            oos.writeObject(new String("new string"));
            oos.writeObject(new File("file.name"));
            oos.writeObject(new Date());
            //oos.writeObject(new OutputStream());//abstract class;
            oos.writeObject(new JFrame("My Frame"));
            oos.writeObject(new Integer(3));
            //oos.writeObject(new System());//private constructor;
            oos.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
