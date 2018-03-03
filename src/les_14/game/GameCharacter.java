package les_14.game;

import java.io.Serializable;

public class GameCharacter implements Serializable {
    int power;
    String type;
    Weapon[] weapons;
    void useWeapon(){};
    void getWeapon(){};
    void increasePower(){};
}
