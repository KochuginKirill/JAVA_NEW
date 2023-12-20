package DZ_Sertification;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class FileAssist {
    static void checkFile(String pathToFile){
        String line = "Файл пуст";
        try {
            File file = new File(pathToFile);
            if (file.createNewFile()) {
                System.out.println("Файл создан"); }
            else {
                BufferedReader bufReader =
                        new BufferedReader(new FileReader(file));
                System.out.println("Файл уже есть");
                line = bufReader.readLine();
                bufReader.close(); }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(line);
        }
    }

    static void addStringToFile(String pathToFile, String newText){
        Path path = Paths.get(pathToFile);
        try {
            Files.write(path, newText.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Запись внесена в файл results");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
