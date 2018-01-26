package les_09.duck;

public class DuckFirst {
    int size;
    public DuckFirst(){
        System.out.println("Quacks!");
        size = 27;
        System.out.println("DuckFirst size has been settled to default value equal 27");
        System.out.println("Object DuckFirst has been created");
    }
    public DuckFirst(int duckSize){
        System.out.println("Quacks!");
        size = duckSize;
        System.out.println("DuckFirst size equal " + size);
        System.out.println("Object DuckFirst has been created");
    }
    public void setSize (int newSize){
        size = newSize;
        System.out.println("DuckFirst size equal " + size);
    }
}
