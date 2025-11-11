package Files;

import java.io.File;
import java.io.IOException;

public class MainFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("C:\\Users\\HP\\Desktop\\papka\\notes.txt");
        File myFile2 = new File("C:\\Users\\HP\\Desktop\\papka\\main.txt");
        if(myFile.createNewFile()){
            System.out.println("File created");
            System.out.println("file name: " + myFile.getName());
            System.out.println("file path: " + myFile.getAbsolutePath());
        } else{
            System.out.println("No such a File, Already exists");
            System.out.println("file name: " + myFile.getName());
        }
        if(myFile2.createNewFile()){
            System.out.println("File created");
            System.out.println("file name: " + myFile2.getName());
            System.out.println("file path: " + myFile2.getAbsolutePath());
        } else{
            System.out.println("No such a File, Already exists");
            System.out.println("file name: " + myFile2.getName());
            System.out.println("folder name: " + myFile2.getParent());
            System.out.println("is file?: " + myFile2.isFile());
            System.out.println("is directory?: " + myFile2.isDirectory());
        }
        System.out.println(myFile2.delete());

        System.out.println("existing file: " + myFile.exists());
        System.out.println("file name: " + myFile.getName());
        System.out.println("file path: " + myFile.getAbsolutePath());
    }
}
