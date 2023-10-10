package Wasted_time;

import java.io.*;

public class Phonebook {
    static void checkPhonebookDataBase(String pathToFile){
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

    static void addNewContact(String name, String numbers, String pathToFile){
        try(FileWriter fw = new FileWriter(pathToFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(name + " " + numbers);
        } catch (IOException e) {
            //for later
        }
    }
}
