package les_09.animal;

public class Animal {
    private String name;
    public Animal(String theName){
        System.out.println("Creating Animal");
        name = theName;
    }
    public String getName(){
        return name;
    }
}
