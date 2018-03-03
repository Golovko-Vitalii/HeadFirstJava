package les_14.game;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestDriveGameCharacter {
    public static void main(String[] args){
        GameCharacter characterOne = new GameCharacter();
        GameCharacter characterTwo = new GameCharacter();
        GameCharacter characterThree = new GameCharacter();
        characterOne.type = "Elf";
        characterTwo.type = "Troll";
        characterThree.type = "Magician";
        characterOne.power = 50;
        characterTwo.power = 200;
        characterThree.power = 120;
        characterOne.weapons = new Weapon[] {new Weapon("Bow", 233),
                new Weapon("Sword", 23), new Weapon("Brass", 34)};
        characterTwo.weapons = new Weapon[] {new Weapon("Bare hands", 12),
        new Weapon("Big ax", 33)};
        characterThree.weapons = new Weapon[] {new Weapon("Spells", 1),
                new Weapon("Invisibility", 999)};
        try {
            FileOutputStream fos = new FileOutputStream("MyGame.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(characterOne);
            oos.writeObject(characterTwo);
            oos.writeObject(characterThree);
            oos.close();
        }catch(Exception e){e.printStackTrace();}
    }
}
