package les_16.ex_1;

public class Mountain {
    String name;
    int height;
    Mountain(String name, int height){
        this.name = name;
        this.height = height;
    }
    public String toString(){
        return (this.name+" "+this.height);
    }
}
