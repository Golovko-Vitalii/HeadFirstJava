package les_14.pond;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pond implements Serializable{
    transient private Duck duck = new Duck();
    public static void main(String[] args){
        Pond myPond = new Pond();
        try{
            FileOutputStream fos = new FileOutputStream("Pond.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(myPond);
            oos.close();
        }catch(Exception e){e.printStackTrace();}
    }
}
