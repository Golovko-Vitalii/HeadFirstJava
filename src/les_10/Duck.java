package les_10;

public class Duck {
    private int size;
    private static int duckCount;
    public Duck(){
        duckCount++;
    }
    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }
    public static void main(String[] args){
        //System.out.println("Size of duck is " + size);
        //System.out.println("Size of duck is" + getSize());

    }
}
