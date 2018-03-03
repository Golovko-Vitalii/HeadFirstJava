package les_14.file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("Foo.txt");
            fw.write("My first line for saving");
            fw.close();
        }catch(IOException ex){ex.printStackTrace();}
    }
}
