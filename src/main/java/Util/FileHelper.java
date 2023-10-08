package Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileHelper {
    static void checkFile(String pathToFile){
        String line = "empty";
        try {
            File file = new File(pathToFile);
            if (file.createNewFile()) {
                System.out.println("file.created"); }
            else {
                BufferedReader bufReader =
                        new BufferedReader(new FileReader(file));
                System.out.println("file.existed");
                line = bufReader.readLine();
                bufReader.close(); }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            System.out.println(line);
        }

    }

    static void addStringToFile(String pathToFile, String newText){
        Path path = Paths.get(pathToFile);

        try {
            Files.write(path, newText.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Successfully written bytes to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        checkFile("C:\\Users\\User\\Desktop\\java_new\\java_new\\src\\main\\java\\Util\\test.txt");
        addStringToFile("C:\\Users\\User\\Desktop\\java_new\\java_new\\src\\main\\java\\Util\\test.txt", "\n 123");
    }

}
