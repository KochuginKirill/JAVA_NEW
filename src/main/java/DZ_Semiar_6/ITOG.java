package DZ_Semiar_6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ITOG {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    private static void addNewContact(String name, Integer phoneNum) {
        ArrayList<Integer> newNumber = phoneBook.get(name);
        if (newNumber != null) {
            newNumber.add(phoneNum);
            System.out.println("-------------------------------------------------------");
            System.out.println("Номер добавлен к существующему контакту");
            System.out.println("-------------------------------------------------------");
        } else {
            newNumber = new ArrayList<>();
            newNumber.add(phoneNum);
            phoneBook.put(name, newNumber);
            System.out.println("-------------------------------------------------------");
            System.out.println("Создан новый контакт");
            System.out.println("-------------------------------------------------------");
        }
    }

    private static void findContact(String name) {
        if(phoneBook.get(name) == null){
            System.out.println("-------------------------------------------------------");
            System.out.println("Данный контакт не найден");
            System.out.println("-------------------------------------------------------");
        } else{
            System.out.println(name + " " + phoneBook.get(name));
        }

    }

    private static void printPhoneBook() {
        for (String name: phoneBook.keySet()) {
            String key = name.toString();
            String value = phoneBook.get(name).toString();
            System.out.println(key + " " + value);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int userInput = 0, userNumber = 0;
        String userName = "";
        while(true){
            System.out.println("-------------------------------------------------------");
            System.out.println("Введите 1 для создания нового контакта или добавления номера к уже существующему");
            System.out.println("Введите 2 для поиска контакта");
            System.out.println("Введите 3 для печати телефонной книги в консоль");
            System.out.println("Введите 4 для завершения работы и удаления всех данных");
            System.out.print("Введите здесь =>");
            userInput = s.nextInt();
            if(userInput == 1){
                System.out.println();
                System.out.print("Введите имя контакта =>");
                userName = s.next();
                System.out.println();
                System.out.print("Введите номер контакта в формате целого числа =>");
                userNumber = s.nextInt();
                addNewContact(userName, userNumber);
            }
            if(userInput == 2){
                System.out.println();
                System.out.print("Введите имя контакта =>");
                userName = s.next();
                findContact(userName);
            }
            if(userInput == 3){
                printPhoneBook();
            }
            if(userInput == 4){
                break;
            }

        }

    }
}
