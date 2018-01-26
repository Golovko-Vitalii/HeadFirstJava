package les_09.mushroom;

public class Mushroom {
    int size;
    boolean isMagic;
    public Mushroom(){};
    public Mushroom(int size){
        this.size = size;
    }
    public Mushroom(boolean isMagic){
        this.isMagic = isMagic;
    }
    public Mushroom(int size, boolean isMagic){
        this.size = size;
        this.isMagic = isMagic;
    }
    public Mushroom(boolean isMagic, int size){
        this.size = size;
        this.isMagic = isMagic;
    }
}
