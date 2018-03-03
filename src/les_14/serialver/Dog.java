package les_14.serialver;

import java.awt.*;
import java.io.Serializable;

public class Dog implements Serializable {
    static final long serialVersionUID = 3235235L;
    private String name;
    private int size;
    private Color color;
    public Dog(String name, int size){
        this.name = name;
        this.size = size;
    }
    public String dogToString(){
        return (this.name + ", " + this.size);
    }
}
