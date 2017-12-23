package les_04.good_dog;

public class GoodDog {
    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    void bark(int numOfBarks){
        while (numOfBarks>0) {
            if (size > 60) {
                System.out.println("Гав Гав!");
            } else if (size > 14) {
                System.out.println("Вуф Вуф!");
            } else {
                System.out.println("Тяф Тяф!");
            }
            numOfBarks--;
        }
    }
}
