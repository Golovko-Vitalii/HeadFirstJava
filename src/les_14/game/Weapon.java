package les_14.game;

import java.io.Serializable;

public class Weapon implements Serializable {
    String name;
    int damage;
    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }
}
