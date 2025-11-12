package Files;

import java.io.File;
import java.io.IOException;

public class MainFile1 {
    public static void main(String[] args) throws IOException {
        File myFile = new File("C:\\Users\\HP\\Desktop\\papka");
        File folder1 = new File("C:\\Users\\HP\\Desktop\\papka\\Folder-1");
        File txtFile = new File("C:\\Users\\HP\\Desktop\\papka\\Folder-1\\HelloFromFolder-1.txt");
        File folder2 = new File("C:\\Users\\HP\\Desktop\\papka\\Folder-2");

        System.out.println("Directory myFile: " + myFile.isDirectory());
        System.out.println("Directory Folder-1: " + folder1.isDirectory());
        System.out.println("Directory txtFile: " + txtFile.isDirectory());
        System.out.println("Directory Folder-2: " + folder2.isDirectory());

        System.out.println("Absolute path: " + myFile.getAbsolutePath());
        System.out.println("File name: " + txtFile.getName());
        System.out.println("Last Modified: " + txtFile.lastModified());
        System.out.println("Folder 2 exists: " + folder2.exists());
        System.out.println("Folder 2 delete: " + folder2.delete());
        System.out.println("Folder 2 exists: " + folder2.exists());
    }
}
