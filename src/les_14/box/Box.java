package les_14.box;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable{
    private int width;
    private int height;
    public void setWidth(int w){
        width = w;
    }
    public void setHeight(int h){
        height = h;
    }
    public static void main(String[] args){
        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setWidth(20);
        try{
            FileOutputStream fos = new FileOutputStream("foo.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(myBox);
            oos.close();
        }catch(Exception e){e.printStackTrace();}
    }
}
