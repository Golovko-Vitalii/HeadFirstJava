package les_16.juke_box;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Jukebox {
    ArrayList<Song> songList = new ArrayList<Song>();
    public static void main(String[]args){
        new Jukebox().go();
    }
    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList,artistCompare);
        System.out.println(songList);
        HashSet<Song> songSet = new HashSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);
        TreeSet<Song> songTreeSet1 = new TreeSet<Song>();//used compareTo(Comparable) for sort-adding
        TreeSet<Song> songTreeSet2 = new TreeSet<Song>(artistCompare);// used Comparator for sort-adding
        songTreeSet1.addAll(songList);
        songTreeSet2.addAll(songTreeSet1);
        System.out.println(songTreeSet1);
        System.out.println(songTreeSet2);
    }
    void getSongs(){
        try{
            File file = new File("SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine())!=null){
                addSong(line);
            }
        }catch(Exception ex){ex.printStackTrace();}
    }
    void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
        songList.add(nextSong);
    }
    class ArtistCompare implements Comparator<Song> {
        public int compare(Song one, Song two){
            return one.getArtist().compareTo(two.getArtist());
        }
    }
}
