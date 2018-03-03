package les_14.ex_1;

import java.io.*;

public class DungeonGame implements Serializable {
    public int x = 3;
    transient long y = 4;
    private short z = 5;
    public static void main(String[] args){
        DungeonGame d = new DungeonGame();
        try{
            FileOutputStream fos = new FileOutputStream("dg.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
            System.out.println(d.getX()+d.getY()+d.getZ());
            FileInputStream fis = new FileInputStream("dg.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (DungeonGame)ois.readObject();
            ois.close();
            System.out.println(d.getX()+d.getY()+d.getZ());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    short getZ(){
        return z;
    }
    int getX(){
        return x;
    }
    long getY(){
        return y;
    }
}
