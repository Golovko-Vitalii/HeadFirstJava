package les_16.juke_box;

public class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bpm;
    public int compareTo(Song s){
        return this.title.compareTo(s.getTitle());
    }
    public boolean equals(Object aSong){
        Song s = (Song) aSong;
        return this.getTitle().equals(s.getTitle());
    }
    public int hashCode(){
        return this.getTitle().hashCode();
    }
    Song(String t, String a, String r, String b){
        this.title = t;
        this.artist = a;
        this.rating = r;
        this.bpm = b;
    }
    public String getTitle(){
        return this.title;
    }
    public String getArtist(){
        return this.artist;
    }
    public String getRating(){
        return this.rating;
    }
    public String getBpm(){
        return this.bpm;
    }
    public String toString(){
        return (this.title+": "+this.artist);
    }
}
