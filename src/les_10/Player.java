package les_10;

public class Player {
    static int playerCount = 0;
    private String name;
    public Player(String name){
        this.name = name;
        playerCount++;
    }
}
