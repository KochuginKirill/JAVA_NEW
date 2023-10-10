package Wasted_time;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Сейчас мы подключимся к существующему файлу или создадим новый");
        System.out.print("Укажите путь к файлу базы данных телефонной книги и его название с расширением =>");
        String pathToDatabase = s.nextLine();
        Phonebook.checkPhonebookDataBase(pathToDatabase);
        while(true){
            System.out.print("Введите 1 для добавление контакта");
            int input = s.nextInt();
            if(input == 1){
                System.out.print("Введите имя контакта =>");
                String newName = s.nextLine();
                System.out.print("Введите телефон контакта =>");
                String newNumber = s.nextLine();
                Phonebook.addNewContact(newName, newNumber, pathToDatabase);
            }
        }
    }
}
