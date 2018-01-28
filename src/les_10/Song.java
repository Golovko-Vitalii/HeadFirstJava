package les_10;

public class Song {
    String title;
    public Song(String title){
        this.title = title;
    }
    public void play(){
        String songForPlayer = title;
    }
    public static void main(String[] args){
        Song t2 = new Song("Song");
        t2.play();
    }
}
