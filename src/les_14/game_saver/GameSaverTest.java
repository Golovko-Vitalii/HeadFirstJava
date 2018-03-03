package les_14.game_saver;

import java.io.*;

public class GameSaverTest {
    public static void main(String[] args){
        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"bow",
        "sword", "brass"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[]{"bare hands", "big ax"});
        GameCharacter three = new GameCharacter(120, "Magician", new String[]{"spells",
        "invisibility"});
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("MyGame.ser"));
            oos.writeObject(one);
            oos.writeObject(two);
            oos.writeObject(three);
            oos.close();
        } catch(Exception ex){ex.printStackTrace();}
        one = null;two = null; three = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MyGame.ser"));
            GameCharacter oneRestore = (GameCharacter)ois.readObject();
            GameCharacter twoRestore = (GameCharacter)ois.readObject();
            GameCharacter threeRestore = (GameCharacter)ois.readObject();
            ois.close();
            System.out.println(oneRestore.getType() + " - " + oneRestore.getPower() + " - " +
            oneRestore.getWeapons());
            System.out.println(twoRestore.getType() + " - " + twoRestore.getPower() + " - " +
            twoRestore.getWeapons());
            System.out.println(threeRestore.getType() + " - " + threeRestore.getPower() + " - " +
            threeRestore.getWeapons());
        }catch(Exception ex){ex.printStackTrace();}
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            (new ObjectOutputStream(baos)).writeObject(new GameCharacter(999, "Human", new String[]{"Humanity"}));
            GameCharacter testRestore = (GameCharacter)
                    (new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()))).readObject();
            System.out.println(testRestore.getType() + " - " + testRestore.getPower() + " - " +
            testRestore.getWeapons());
        }catch(Exception ex){ex.printStackTrace();}
    }
}
