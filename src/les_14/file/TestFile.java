package les_14.file;

import java.io.File;

public class TestFile {
    public static void main(String[] args){
        File file = new File("MyCode.txt");
        File dir = new File("Chapter14");
        dir.mkdir();
        if(dir.isDirectory()){
            String[] dirContents = dir.list();
            for(int i=0; i<dirContents.length; i++){
                System.out.println(dirContents[i]);
            }
        }
        System.out.println(dir.getAbsolutePath());
        boolean isDeleted = file.delete();
        System.out.println(isDeleted);
    }
}
