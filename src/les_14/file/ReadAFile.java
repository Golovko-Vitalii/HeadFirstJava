package les_14.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadAFile {
    public static void main(String[] args){
        try {
            File file = new File("Foo.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        }catch(Exception ex){ex.printStackTrace();}
    }
}
